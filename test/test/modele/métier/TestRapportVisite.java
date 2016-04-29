/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.métier;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import metier.Labo;
import metier.Praticien;
import metier.RapportVisite;
import metier.Secteur;
import metier.TypePraticien;
import metier.Visiteur;

/**
 *
 * @author btssio
 */
public class TestRapportVisite {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Test n°1: instanciation et accesseurs
        System.out.println("\nTest n°1: instanciation et accesseurs");
        TypePraticien unTypePra = new TypePraticien("CC", "test coucou", "local ");
        Labo lab = new Labo("GY", "Gyverni", "Merss Suzanne");
        Secteur sec = new Secteur("N", "Nord");
        Visiteur unVisiteur = new Visiteur("b52", "Bernard", "Simon", "65 rue du Bourg", "44000", "Nantes", sdf.parse("20/11/2012"), sec, lab);
        
        Praticien unPra = new Praticien(150, "Dinam", "noel", "adresse", "cp", "ville", Float.parseFloat("45.2"), unTypePra);
        RapportVisite unRapportVisite = new RapportVisite(unVisiteur, 1, unPra, sdf.parse("20/11/2012"), "test", null);

        System.out.println("Rapport  : " + unRapportVisite);

        // Test n°2 : mutateurs
        System.out.println("\nTest n°2 : mutateurs");
        TypePraticien unTypePraBis = new TypePraticien("bloup", "test ", "international ");
        Praticien unPraBis = new Praticien(25, "tremendous", "bill", "adresse", "cp", "ville", Float.parseFloat("45.2"), unTypePraBis);
        RapportVisite unRapportVisiteBis = new RapportVisite();
        unRapportVisiteBis.setUnVisiteur(unVisiteur);
        unRapportVisiteBis.setNumRap(3);
        unRapportVisiteBis.setUnPraticien(unPraBis);
        unRapportVisiteBis.setDate(sdf.parse("20/11/2012"));
        unRapportVisiteBis.setBilan("c'était cool");
        unRapportVisiteBis.setMotif("plus de médoc");

        System.out.println("Rapport Visite 2 : " + unRapportVisiteBis);
    }
}
