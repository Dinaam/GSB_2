/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.métier;

import metier.Praticien;
import metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class TestPraticien {

    public static void main(String[] args) {
        Praticien unPra = null;
        //Test n°1: instanciation et accesseurs
        System.out.println("\nTest n°1: instanciation et accesseurs");
        TypePraticien unTypePra = new TypePraticien("CC", "test coucou", "local ");
        unPra = new Praticien(150, "noulet", "sylvain", "adresse", "cp", "ville", Float.parseFloat("45.2"), unTypePra);
        System.out.println("Etat du Praticien: " + unPra.toString2());

        // Test n°2 : mutateurs
        System.out.println("\nTest n°2 : mutateurs");
        unPra.setId(200);
        unPra.setNom("Zola");
        unPra.setPrenom("Emile");
        unPra.setAdresse("adr2");
        unPra.setCp("cp2");
        unPra.setVille("ville2");
        unPra.setCoef(Float.parseFloat("50.0"));
        TypePraticien unTypePra2 = new TypePraticien("PC", "test pas coucou", "Local Jol");
        unPra.setTypePraticien(unTypePra2);
        System.out.println("Etat du type : " + unPra.toString2());
    }
}
