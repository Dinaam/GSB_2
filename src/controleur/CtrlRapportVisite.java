/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import dao.DaoRapportVisite;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import metier.RapportVisite;
import vues.VueRapportVisite;

/**
 *
 * @author Maxime
 */
public class CtrlRapportVisite implements ActionListener
{
    List<RapportVisite> lesRapportsVisites;
    private VueRapportVisite vue;
    private String matricule;
    RapportVisite unRapportVisite;
    
    CtrlRapportVisite(VueRapportVisite vue, String matricule) 
    {
        this.matricule = matricule;
        this.vue = vue;
        afficherLesRapportsVisites();
    }
    
    public final void afficherLesRapportsVisites()
    {
        try {
            unRapportVisite = DaoRapportVisite.selectOnByMatricule(matricule);
        }catch (SQLException ex) {
            //      JOptionPane.showMessageDialog(vue, "Ctrl - échec de sélection des adresses");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(vue, "Ctrl - erreur SQL");
        }
    }
    
    public void afficherRapportVisite()
    {
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
    
}
