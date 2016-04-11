/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vues.VueMedicament;
import vues.VueMenu;
import vues.VueVisiteur;
import vues.VuePraticiens;
import vues.VueRapportVisite;

/**
 *
 * @author Dinam
 */
public class CtrlMenu implements ActionListener{
    private VueMenu vueMenu;
    private VueVisiteur vueVisiteur;
    private VuePraticiens vuePracticiens;
    private VueRapportVisite vueRapportVisite;
    private VueMedicament vueMedicament;
    

    public CtrlMenu(VueMenu vue) {
    this.vueMenu =  vue;
    vueMenu.getjButtonVisiteurs().addActionListener(this);
    vueMenu.getjButtonRapport().addActionListener(this);
    vueMenu.getjButtonPracticiens().addActionListener(this);
    vueMenu.getjButtonRapport().addActionListener(this);
    vueMenu.getjButtonMedicaments().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vueMenu.getjButtonVisiteurs()) {
            vueVisiteur = new VueVisiteur();
            CtrlVisiteurs ctrlVisiteur = new CtrlVisiteurs(vueVisiteur);
            vueVisiteur.setVisible(true);
        }
        if (source == vueMenu.getjButtonPracticiens()) {
            vuePracticiens = new VuePraticiens();
            CtrlPraticiens ctrlPracticien = new CtrlPraticiens(vuePracticiens);
            vuePracticiens.setVisible(true);
        }
        if(source == vueMenu.getjButtonRapport()) {
            vueRapportVisite = new VueRapportVisite();
            CtrlRapportVisite ctrlRapportVisite = new CtrlRapportVisite(vueRapportVisite);
            vueRapportVisite.setVisible(true);
        }
        if(source == vueMenu.getjButtonMedicaments()) {
            vueMedicament = new VueMedicament();
            CtrlMedicaments ctrlMedicaments = new CtrlMedicaments(vueMedicament);
            vueMedicament.setVisible(true);
        }
        
    }
}
