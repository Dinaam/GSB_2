/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import dao.DaoVisiteurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import metier.Visiteur;
import vues.VueConnexion;
import vues.VueMenu;

/**
 *
 * @author Dinam
 */
public class CtrlConnexion implements ActionListener {

    private VueConnexion vueConnexion;
    private VueMenu vueMenu;

    public CtrlConnexion(VueConnexion vue) {
        this.vueConnexion = vue;
        vue.getjButtonConnect().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vueConnexion.getjButtonConnect()) {
            String login = vueConnexion.getjTextFieldLogin().getText();
            String mdp = vueConnexion.getjPasswordFieldMdp().getText();
            
            

            try {
                
                Visiteur unVisiteur = DaoVisiteurs.selectOneByLogin(login);
                if (unVisiteur == null) {
                    JOptionPane.showMessageDialog(vueConnexion, "Aucun visiteur avec ce login");
                } else {

                    if (mdp.equals(unVisiteur.getMatricule())) {
                        vueMenu = new VueMenu();
                        CtrlMenu ctrlMenu = new CtrlMenu(vueMenu);
                        vueMenu.setVisible(true);
                        vueConnexion.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(vueConnexion, "Le mot de passe n'est pas correcte");
                    }
                }
            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }

    }

}
