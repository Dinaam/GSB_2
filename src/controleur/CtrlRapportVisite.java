/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import dao.DaoPraticien;
import dao.DaoRapportVisite;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import metier.Praticien;
import metier.RapportVisite;
import vues.VueRapportVisite;
import vues.VuePraticiens;

/**
 *
 * @author Maxime
 */
public class CtrlRapportVisite implements ActionListener
{
    List<RapportVisite> lesRapportsVisites;
    List<Praticien> lesPraticiens;
    private VueRapportVisite vue;
    private String matricule;
    private VuePraticiens vueDet;
    RapportVisite unRapport;
    Praticien unPraticien;
    
    CtrlRapportVisite(VueRapportVisite vue, String mdp) 
    {
        this.vue = vue;
        this.matricule = mdp;
        afficherLesRapports();
        vue.getjButtonQuitter().addActionListener(this);
        vue.getjButtonOk().addActionListener(this);
        vue.getjButtonDetails().addActionListener(this);
    }
    
    public final void afficherLesRapports() {
        try {
            lesRapportsVisites = DaoRapportVisite.selectAllByMatricule(matricule);
            lesPraticiens = DaoPraticien.getAll();
            for (Praticien unPraticien : lesPraticiens) {
                vue.getModeleListePracticiens().addElement(unPraticien); 
            }

        } catch (SQLException ex) {
            //      JOptionPane.showMessageDialog(vue, "Ctrl - échec de sélection des adresses");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(vue, "Ctrl - erreur SQL");
        }

    }
    
    public void afficherRapport()
    {
        unRapport = (RapportVisite) (vue.getjComboBoxPraticien().getSelectedItem());
        vue.getjTextFieldNumRap().setText(Float.toString(0));

    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == vue.getjButtonQuitter()) {
            vue.dispose();
        }
        if(source == vue.getjButtonDetails()) {
            vueDet = new VuePraticiens();
            vueDet.setVisible(true);
            CtrlPraticiens ctrlPracticien = new CtrlPraticiens(vueDet);
            unPraticien = (Praticien) vue.getjComboBoxPraticien().getSelectedItem();
            
            vueDet.getjTextFieldNum().setText(Integer.toString(unPraticien.getId()));
            vueDet.getjTextFieldNom().setText(unPraticien.getNom());
            vueDet.getjTextFieldPrenom().setText(unPraticien.getPrenom());
            vueDet.getjTextFieldAdresse().setText(unPraticien.getAdresse());
            vueDet.getjTextFieldCp().setText(unPraticien.getCp());
            vueDet.getjTextFieldVille().setText(unPraticien.getVille());
            vueDet.getjTextFieldCoeff().setText(Float.toString(unPraticien.getCoef()));         
        }
        
        if(source == vue.getjButtonOk()) {
            unRapport = (RapportVisite) vue.getjComboBoxPraticien().getSelectedItem();
            vue.getjTextFieldNumRap().setText(Float.toString(0));
        }
        
    }
    
}
