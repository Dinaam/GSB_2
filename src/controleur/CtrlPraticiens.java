/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import dao.DaoPraticien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import metier.Praticien;
import metier.Secteur;
import metier.TypePraticien;
import metier.Visiteur;
import vues.VuePraticiens;

/**
 *
 * @author Maxime
 */
public class CtrlPraticiens implements ActionListener {

    List<Praticien> lesPraticiens;
    List<TypePraticien> lesTypePraticiens;
    Praticien unPraticien;

    private VuePraticiens vue;

    CtrlPraticiens(VuePraticiens vue) {
        this.vue = vue;
        afficherLesPraticiens();
        afficherPraticien();
        //ajout des écouteurs sur les boutons de la vue
        vue.getjButtonOk().addActionListener(this);
        vue.getjButtonSuivant().addActionListener(this);
        vue.getjButtonPrecedent().addActionListener(this);
        vue.getjButtonQuitter().addActionListener(this);
    }

    public final void afficherLesPraticiens() {
        try {
            //remplit la liste des praticiens
            lesPraticiens = DaoPraticien.getAll();
            for (Praticien unPraticien : lesPraticiens) {
                vue.getModeleListePraticiens().addElement(unPraticien);
            }

        } catch (SQLException ex) {
            //      JOptionPane.showMessageDialog(vue, "Ctrl - échec de sélection des adresses");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(vue, "Ctrl - erreur SQL");
        }

    }

    public void afficherPraticien() {
        //Sélectionne le visiteur
        unPraticien = (Praticien) (vue.getjComboBoxSearch().getSelectedItem());

        //Affichage
        vue.getjTextFieldNum().setText(Integer.toString(unPraticien.getId()));
        vue.getjTextFieldNom().setText(unPraticien.getNom());
        vue.getjTextFieldPrenom().setText(unPraticien.getPrenom());
        vue.getjTextFieldAdresse().setText(unPraticien.getAdresse());
        vue.getjTextFieldCp().setText(unPraticien.getCp());
        vue.getjTextFieldVille().setText(unPraticien.getVille());
        vue.getjTextFieldCoeff().setText(Float.toString(unPraticien.getCoef()));
        TypePraticien typePraticien = unPraticien.getTypePraticien();
        if (typePraticien != null) {
            vue.getjTextFieldLieu().setText(typePraticien.getLibelle());
        } else {
            vue.getjTextFieldLieu().setText("aucun");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //bouton quitter
        if (source == vue.getjButtonQuitter()) {
            vue.dispose();
        }
        //bouton Ok
        if (source == vue.getjButtonOk()) {
            unPraticien = (Praticien) vue.getjComboBoxSearch().getSelectedItem();
            vue.getjTextFieldNum().setText(Float.toString(unPraticien.getId()));
            vue.getjTextFieldNom().setText(unPraticien.getNom());
            vue.getjTextFieldPrenom().setText(unPraticien.getPrenom());
            vue.getjTextFieldAdresse().setText(unPraticien.getAdresse());
            vue.getjTextFieldVille().setText(unPraticien.getVille());
            vue.getjTextFieldCp().setText(unPraticien.getCp());
            vue.getjTextFieldCoeff().setText(Float.toString(unPraticien.getCoef()));

            TypePraticien typePraticien = unPraticien.getTypePraticien();
            if (typePraticien != null) {
                vue.getjTextFieldLieu().setText(typePraticien.getLibelle());
            } else {
                vue.getjTextFieldLieu().setText("aucun");
            }

        }
        //Bouton suivant
        if (source == vue.getjButtonSuivant()) {
            int i = vue.getjComboBoxSearch().getSelectedIndex();
            int z = i + 1;
            if (z < vue.getjComboBoxSearch().getItemCount()) {
                unPraticien = (Praticien) vue.getjComboBoxSearch().getItemAt(z);
                vue.getjComboBoxSearch().setSelectedIndex(z);
                vue.getjTextFieldNum().setText(Float.toString(unPraticien.getId()));
                vue.getjTextFieldNom().setText(unPraticien.getNom());
                vue.getjTextFieldPrenom().setText(unPraticien.getPrenom());
                vue.getjTextFieldAdresse().setText(unPraticien.getAdresse());
                vue.getjTextFieldVille().setText(unPraticien.getVille());
                vue.getjTextFieldCp().setText(unPraticien.getCp());
                vue.getjTextFieldCoeff().setText(Float.toString(unPraticien.getCoef()));

                TypePraticien typePraticien = unPraticien.getTypePraticien();
                if (typePraticien != null) {
                    vue.getjTextFieldLieu().setText(typePraticien.getLibelle());
                } else {
                    vue.getjTextFieldLieu().setText("aucun");
                }

            }

        }
        //bouton précédent
        if (source ==  vue.getjButtonPrecedent()) {
           int i = vue.getjComboBoxSearch().getSelectedIndex();
           int z = i-1;
           if (z >= 0) {                
                unPraticien = (Praticien) vue.getjComboBoxSearch().getItemAt(z);
                vue.getjComboBoxSearch().setSelectedIndex(z);
                vue.getjTextFieldNum().setText(Float.toString(unPraticien.getId()));
                vue.getjTextFieldNom().setText(unPraticien.getNom());     
                vue.getjTextFieldPrenom().setText(unPraticien.getPrenom()); 
                vue.getjTextFieldAdresse().setText(unPraticien.getAdresse()); 
                vue.getjTextFieldVille().setText(unPraticien.getVille());   

               TypePraticien typePraticien = unPraticien.getTypePraticien();
                if (typePraticien != null) {
                    vue.getjTextFieldLieu().setText(typePraticien.getLibelle());
                } else {
                    vue.getjTextFieldLieu().setText("aucun");
                }               
                
           }
                
       }
    }
}
