/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import metier.Visiteur;
import vues.VueVisiteur;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import dao.DaoVisiteurs;
import metier.Labo;
import metier.Secteur;
import vues.VueMenu;

/**
 *
 * @author btssio
 */
public class CtrlVisiteurs implements ActionListener {
    private VueVisiteur vue;
    private List<Visiteur> lesVisiteurs;
    private Visiteur unVisiteur;
    

    public CtrlVisiteurs(VueVisiteur vue) {
        this.vue = vue;
        afficherLesVisiteurs();
        vue.getjButtonOk().addActionListener(this);
        vue.getjButtonSuivant().addActionListener(this);        
        vue.getjButtonPrecedent().addActionListener(this);
        vue.getjButtonFermer().addActionListener(this);

    }

        
    public final void afficherLesVisiteurs() {
        try {
            lesVisiteurs = DaoVisiteurs.getAll();
            for (Visiteur visiteur : lesVisiteurs){
                vue.getModeleListeVisiteurs().addElement(visiteur);                
            }
            
        } catch (SQLException ex) {
      //      JOptionPane.showMessageDialog(vue, "Ctrl - échec de sélection des adresses");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(vue, "Ctrl - erreur SQL");
        }

    }
                                               

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == vue.getjButtonFermer()){
           vue.dispose();
        }
        if (source ==  vue.getjButtonOk()) {
            unVisiteur = (Visiteur) vue.getjComboBoxListeVisiteurs().getSelectedItem();           
            vue.getjTextFieldNom().setText(unVisiteur.getNom());     
            vue.getjTextFieldPrenom().setText(unVisiteur.getPrenom()); 
            vue.getjTextFieldAdresse().setText(unVisiteur.getAdresse()); 
            vue.getjTextFieldVille().setText(unVisiteur.getVille()); 
            vue.getjTextFieldCp().setText(unVisiteur.getCp());
            
            
                  
            Secteur secteur = unVisiteur.getSecteur();
                if (secteur == null) {
                    vue.getjTextFieldSecteur().setText("");
                } else {
                    vue.getjTextFieldSecteur().setText(unVisiteur.getSecteur().getSec_libelle());
                }
        vue.getjTextFieldLabo().setText(unVisiteur.getLabo().getLab_nom());
       }
       
       if (source ==  vue.getjButtonSuivant()) {
           int i = vue.getjComboBoxListeVisiteurs().getSelectedIndex();
           int z = i+1;
           if (z < vue.getjComboBoxListeVisiteurs().getItemCount()) {                
                unVisiteur = (Visiteur) vue.getjComboBoxListeVisiteurs().getItemAt(z);
                vue.getjComboBoxListeVisiteurs().setSelectedIndex(z);
                vue.getjTextFieldNom().setText(unVisiteur.getNom());     
                vue.getjTextFieldPrenom().setText(unVisiteur.getPrenom()); 
                vue.getjTextFieldAdresse().setText(unVisiteur.getAdresse()); 
                vue.getjTextFieldVille().setText(unVisiteur.getVille());  
                vue.getjTextFieldCp().setText(unVisiteur.getCp());
            
                Secteur secteur = unVisiteur.getSecteur();
                if (secteur == null) {
                    vue.getjTextFieldSecteur().setText("");
                } else {
                    vue.getjTextFieldSecteur().setText(unVisiteur.getSecteur().getSec_libelle());
                }
        
            vue.getjTextFieldLabo().setText(unVisiteur.getLabo().getLab_nom());
        

       
           }
                
       }
       
        if (source ==  vue.getjButtonPrecedent()) {
           int i = vue.getjComboBoxListeVisiteurs().getSelectedIndex();
           int z = i-1;
           if (z >= 0) {                
                unVisiteur = (Visiteur) vue.getjComboBoxListeVisiteurs().getItemAt(z);
                vue.getjComboBoxListeVisiteurs().setSelectedIndex(z);
                vue.getjTextFieldNom().setText(unVisiteur.getNom());     
                vue.getjTextFieldPrenom().setText(unVisiteur.getPrenom()); 
                vue.getjTextFieldAdresse().setText(unVisiteur.getAdresse()); 
                vue.getjTextFieldVille().setText(unVisiteur.getVille());   

               Secteur secteur = unVisiteur.getSecteur();
                if (secteur == null) {
                    vue.getjTextFieldSecteur().setText("");
                } else {
                    vue.getjTextFieldSecteur().setText(unVisiteur.getSecteur().getSec_libelle());
                }
                
               vue.getjTextFieldLabo().setText(unVisiteur.getLabo().getLab_nom());
               
                
           }
                
       }
        
    }
        
}

