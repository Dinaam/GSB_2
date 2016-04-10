/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vues.VueMenu;
import vues.VueVisiteur;
import vues.VuePracticiens;

/**
 *
 * @author Dinam
 */
public class CtrlMenu implements ActionListener{
    private VueMenu vueMenu;
    private VueVisiteur vueVisiteur;
    private VuePracticiens vuePracticiens;
    

    public CtrlMenu(VueMenu vue) {
    this.vueMenu =  vue;
    vueMenu.getjButtonVisiteurs().addActionListener(this);
    vueMenu.getjButtonRapport().addActionListener(this);
    vueMenu.getjButtonPracticiens().addActionListener(this);
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
            vuePracticiens = new VuePracticiens();
            CtrlPracticiens ctrlPracticien = new CtrlPracticiens(vuePracticiens);
            vuePracticiens.setVisible(true);
        }
        
    }
}
