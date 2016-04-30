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
import static java.lang.String.valueOf;
import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    int i = 0;
    int countLesRap = 0;
    boolean add = false;     

    
    CtrlRapportVisite(VueRapportVisite vue, String mdp) 
    {
        this.vue = vue;
        this.matricule = mdp;
        afficherLesRapports();
        vue.getjButtonQuitter().addActionListener(this);
        vue.getjButtonOk().setVisible(false);
        vue.getjButtonOk().addActionListener(this);
        vue.getjButtonNouveau().addActionListener(this);
        vue.getjButtonDetails().addActionListener(this);
        vue.getjButtonSuivant().addActionListener(this);
        vue.getjButtonPrecedent().addActionListener(this);
    }
    
    public final void afficherLesRapports() {
        try {
                       
            lesRapportsVisites = DaoRapportVisite.selectAllByMatricule(matricule);
            lesPraticiens = DaoPraticien.getAll();
            //unRapport = (RapportVisite) (vue.getjComboBoxPraticien().getSelectedItem());

            /* for (Praticien unPraticien : lesPraticiens) {
                vue.getModeleListePracticiens().addElement(unPraticien);
            } */
                                                
            vue.getjTextFieldNumRap().setText(Integer.toString(lesRapportsVisites.get(i).getNumRap()));
            vue.getModeleListePracticiens().setSelectedItem(lesRapportsVisites.get(i).getUnPraticien());
            vue.getjDateChooserDate().setDate(lesRapportsVisites.get(i).getDate());
            vue.getjTextFieldMotif().setText(lesRapportsVisites.get(i).getMotif());
            vue.getjTextFieldBilan().setText(lesRapportsVisites.get(i).getBilan());
                        
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
        vue.getjTextFieldNumRap().setText(Float.toString(unRapport.getNumRap()));
    }
    
    
    
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == vue.getjButtonQuitter()) {
            vue.dispose();
        }
        if (source == vue.getjButtonNouveau()) {
            
            if (lesRapportsVisites.isEmpty()) {
                vue.getjTextFieldNumRap().setText("1");
            } else {
                int num = lesRapportsVisites.size()-1;
                vue.getjTextFieldNumRap().setText(valueOf(lesRapportsVisites.get(num).getNumRap() +1));
            }
            
            add = true;
            
            vue.getjButtonOk().setVisible(true);
            vue.getjDateChooserDate().setDate(null);
            vue.getjTextFieldMotif().setText("");
            vue.getjTextFieldBilan().setText("");
            
        }
        if (source == vue.getjButtonOk()) {
            if (add == false) {
                JOptionPane.showMessageDialog(vue, "Merci de créer un nouveau rapport pour ajouter", "Ajout Erreur",
                JOptionPane.ERROR_MESSAGE);
            } else {
                
                unPraticien = (Praticien) vue.getModeleListePracticiens().getSelectedItem();
                String numRap = vue.getjTextFieldNumRap().getText();
                int id = unPraticien.getId();
                Date date = vue.getjDateChooserDate().getDate();
                String date2 = new SimpleDateFormat("yyyy-MM-dd").format(date);
                String motif = vue.getjTextFieldMotif().getText();
                String bilan = vue.getjTextFieldBilan().getText();
                
               try {
                  
                    DaoRapportVisite.insertDatabase(matricule, numRap, id, date2, bilan, motif);
                    
                    JOptionPane.showMessageDialog(vue, "Le rapport visite à bien été créé", "Ajout Success",
                    JOptionPane.INFORMATION_MESSAGE);
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(CtrlRapportVisite.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CtrlRapportVisite.class.getName()).log(Level.SEVERE, null, ex);
                } 
                    
                

                
            }
        }
        if (source == vue.getjButtonSuivant()) {
            if(i < lesRapportsVisites.size()-1) {
                vue.getjTextFieldNumRap().setText(Integer.toString(lesRapportsVisites.get(i+1).getNumRap()));
                vue.getModeleListePracticiens().setSelectedItem(lesRapportsVisites.get(i+1).getUnPraticien());
                vue.getjDateChooserDate().setDate(lesRapportsVisites.get(i+1).getDate());
                vue.getjTextFieldMotif().setText(lesRapportsVisites.get(i+1).getMotif());
                vue.getjTextFieldBilan().setText(lesRapportsVisites.get(i+1).getBilan());
                i++;
            }
            System.out.println(lesRapportsVisites.get(i));
        }
        if (source == vue.getjButtonPrecedent()) {
            if( i > 0) {
                vue.getjTextFieldNumRap().setText(Integer.toString(lesRapportsVisites.get(i-1).getNumRap()));
                vue.getModeleListePracticiens().setSelectedItem(lesRapportsVisites.get(i-1).getUnPraticien());
                vue.getjDateChooserDate().setDate(lesRapportsVisites.get(i-1).getDate());
                vue.getjTextFieldMotif().setText(lesRapportsVisites.get(i-1).getMotif());
                vue.getjTextFieldBilan().setText(lesRapportsVisites.get(i-1).getBilan());
                i--;
            }
        }
        if (source == vue.getjButtonDetails()) {
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
            
            int z = vue.getjComboBoxPraticien().getSelectedIndex();
            
            vueDet.getjComboBoxSearch().setSelectedIndex(z);
            
        }
    }
}