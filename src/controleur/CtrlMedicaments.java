/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import dao.DaoMedicament;
import dao.DaoPraticien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import metier.Famille;
import metier.Medicament;
import vues.VueMedicament;

/**
 *
 * @author Maxime
 */
public class CtrlMedicaments implements ActionListener {

    List<Medicament> lesMedicaments;
    List<Famille> lesFamilles;
    Medicament unMedicament;

    private VueMedicament vue;

    CtrlMedicaments(VueMedicament vue) {
        this.vue = vue;
        afficherLesMedicaments();
        afficherMedicament();
        vue.getjButtonOk().addActionListener(this);
        vue.getjButtonSuivant().addActionListener(this);
        vue.getjButtonPrecedent().addActionListener(this);
        vue.getjButtonQuitter().addActionListener(this);
    }

    public final void afficherLesMedicaments() {
        try {
            lesMedicaments = DaoMedicament.getAll();
            for (Medicament unMedicament : lesMedicaments) {
                vue.getModeleListeMedicaments().addElement(unMedicament);
            }

        } catch (SQLException ex) {
            //      JOptionPane.showMessageDialog(vue, "Ctrl - échec de sélection des adresses");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(vue, "Ctrl - erreur SQL");
        }

    }

    public void afficherMedicament() {
        unMedicament = (Medicament) (vue.getjComboBoxSearch().getSelectedItem());

        //Affichage
        vue.getjTextFieldCode().setText(unMedicament.getCode());
        vue.getjTextFieldCompo().setText(unMedicament.getComposition());
        vue.getjTextAreaEffets().setText(unMedicament.getEffets());
        vue.getjTextAreaContreIndic().setText(unMedicament.getContreIndic());
        vue.getjTextFieldPrix().setText(Float.toString(unMedicament.getPrix()));
        Famille uneFamille = unMedicament.getUneFamille();
        if (uneFamille != null) {
            vue.getjTextFieldFamille().setText(uneFamille.getLibelle());
        } else {
            vue.getjTextFieldFamille().setText("aucun");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vue.getjButtonQuitter()) {
            vue.dispose();
        }
        if (source == vue.getjButtonOk()) {
            unMedicament = (Medicament) vue.getjComboBoxSearch().getSelectedItem();
            vue.getjTextFieldCode().setText(unMedicament.getCode());
            vue.getjTextFieldCompo().setText(unMedicament.getComposition());
            vue.getjTextAreaEffets().setText(unMedicament.getEffets());
            vue.getjTextAreaContreIndic().setText(unMedicament.getContreIndic());
            vue.getjTextFieldPrix().setText(Float.toString(unMedicament.getPrix()));
            Famille uneFamille = unMedicament.getUneFamille();
            if (uneFamille != null) {
                vue.getjTextFieldFamille().setText(uneFamille.getLibelle());
            } else {
                vue.getjTextFieldFamille().setText("aucun");
            }

        }
        if (source == vue.getjButtonSuivant()) {
            int i = vue.getjComboBoxSearch().getSelectedIndex();
            int z = i + 1;
            if (z < vue.getjComboBoxSearch().getItemCount()) {
                unMedicament = (Medicament) vue.getjComboBoxSearch().getItemAt(z);
                vue.getjComboBoxSearch().setSelectedIndex(z);
                vue.getjTextFieldCode().setText(unMedicament.getCode());
                vue.getjTextFieldCompo().setText(unMedicament.getComposition());
                vue.getjTextAreaEffets().setText(unMedicament.getEffets());
                vue.getjTextAreaContreIndic().setText(unMedicament.getContreIndic());
                vue.getjTextFieldPrix().setText(Float.toString(unMedicament.getPrix()));
                Famille uneFamille = unMedicament.getUneFamille();
                if (uneFamille != null) {
                    vue.getjTextFieldFamille().setText(uneFamille.getLibelle());
                } else {
                    vue.getjTextFieldFamille().setText("aucun");
                }

            }

        }

        if (source == vue.getjButtonPrecedent()) {
            int i = vue.getjComboBoxSearch().getSelectedIndex();
            int z = i - 1;
            if (z >= 0) {
                unMedicament = (Medicament) vue.getjComboBoxSearch().getItemAt(z);
                vue.getjComboBoxSearch().setSelectedIndex(z);
                vue.getjTextFieldCode().setText(unMedicament.getCode());
                vue.getjTextFieldCompo().setText(unMedicament.getComposition());
                vue.getjTextAreaEffets().setText(unMedicament.getEffets());
                vue.getjTextAreaContreIndic().setText(unMedicament.getContreIndic());
                vue.getjTextFieldPrix().setText(Float.toString(unMedicament.getPrix()));
                Famille uneFamille = unMedicament.getUneFamille();
                if (uneFamille != null) {
                    vue.getjTextFieldFamille().setText(uneFamille.getLibelle());
                } else {
                    vue.getjTextFieldFamille().setText("aucun");
                }

            }

        }
    }
}
