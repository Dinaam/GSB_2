/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.métier;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Visiteur;
import metier.Labo;
import metier.Secteur;

/**
 *
 * @author guillaume
 */
public class TestVisiteurs {
    
    public static void main(String[] args) throws ParseException {
        
        Visiteur visit = null;
        Secteur sec = new Secteur("","");
        Labo lab = new Labo("","","");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        // Test n°1 : instanciation et accesseurs
        System.out.println("\nTest n°1 : instanciation et accesseurs");
        try {
            visit = new Visiteur("a131","Villechalane","Louis","29000\n","cours Lafontaine","BREST", sdf.parse("11/12/1992"), sec, lab);
        } catch (ParseException ex) {
            Logger.getLogger(TestVisiteurs.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Etat du visiteur : " + visit);
        
        // Test n°2 : mutateurs
        System.out.println("\nTest n°2 : mutateurs");
        visit.setMatricule("a17");
        visit.setNom("Andre");
        visit.setPrenom("David");
        visit.setCp("38100\n");
        visit.setAdresse("1 r Aimon de Chissée");
        visit.setVille("GRENOBLE");
        System.out.println("Etat du visiteur : " + visit);
    }
}
