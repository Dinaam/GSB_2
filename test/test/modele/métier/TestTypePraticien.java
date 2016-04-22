/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.métier;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class TestTypePraticien {

    public static void main(String[] args) {
        TypePraticien unTypePra = null;
        //Test n°1: instanciation et accesseurs
        System.out.println("\nTest n°1: instanciation et accesseurs");
        unTypePra = new TypePraticien("CC", "test", "local ");
        System.out.println("Etat du TypePraticien: " + unTypePra.toString2());

        // Test n°2 : mutateurs
        System.out.println("\nTest n°2 : mutateurs");
        unTypePra.setCode("PC");
        unTypePra.setLibelle("nouveau test");
        unTypePra.setLieu("Jol");
        System.out.println("Etat du type : " + unTypePra.toString2());
    }
}
