/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.métier;

import metier.Famille;

/**
 *
 * @author btssio
 */
public class TestFamille {

    public static void main(String[] args) {
        Famille famille = null;
        //Test n°1: instanciation et accesseurs
        System.out.println("\nTest n°1: instanciation et accesseurs");
        famille = new Famille("GYC", "Gyverni");
        System.out.println("Etat de famille: " + famille);

        // Test n°2 : mutateurs
        System.out.println("\nTest n°2 : mutateurs");
        famille.setFamCode("BIC");
        famille.setLibelle("Bichat");
        System.out.println("Etat de la famille : " + famille);
    }
}
