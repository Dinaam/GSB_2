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
    RapportVisite unRapport;
    Praticien unPraticien;
    
    CtrlRapportVisite(VueRapportVisite vue, String mdp) 
    {
        this.vue = vue;
        this.matricule = mdp;
        afficherLesRapports();
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
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
    
}
