/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.métier;

import metier.Famille;
import metier.Labo;
import metier.Medicament;

/**
 *
 * @author btssio
 */
public class TestMedicament {

    public static void main(String[] args) {
        Medicament medicament = null;
        Famille famille = null;
        //Test n°1: instanciation et accesseurs
        System.out.println("\nTest n°1: instanciation et accesseurs");
        famille = new Famille("GYC", "Gyverni");
        medicament = new Medicament("TES", "TUESPORAL", "HO+CH+FG", "douleur", "Non", 3.00, famille);
        System.out.println("Etat du medicament: " + medicament.toString2());

        // Test n°2 : mutateurs
        System.out.println("\nTest n°2 : mutateurs");
        medicament.setCode("BC");
        medicament.setNom("Bichat");
        medicament.setComposition("CH");
        medicament.setEffets("DOULEUR");
        medicament.setContreIndic("OUI");
        medicament.setPrix(5.00);
        medicament.setUneFamille(famille);
        System.out.println("Etat du medicament: " + medicament);
    }
}
