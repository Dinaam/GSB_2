/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import dao.DaoFamille;
import dao.DaoMedicament;
import dao.DaoPraticien;
import dao.DaoRapportVisite;
import dao.DaoVisiteurs;
import dao.Jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import metier.Medicament;
import metier.Praticien;
import metier.RapportVisite;
import metier.Visiteur;

/**
 *
 * @author btssio
 */
public class TestDaoRapportVisite {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        java.sql.Connection cnx = null;

        try {
            System.out.println("---- DEBUT DU PROGRAMME DE TESTS ----");
            System.out.println("Test0 : connexion");
            test0_Connexion();
            System.out.println("Test0 : effectué");
            System.out.println("Test1 : selectAllByMatricule");
            test1_selectAllByMatricule("a131");
            System.out.println("Test : effectué");
            

        } catch (ClassNotFoundException e) {
            System.err.println("Erreur de pilote JDBC : " + e);
        } catch (SQLException e) {
            System.err.println("Erreur SQL : " + e);
        } finally {
            System.out.println("---- FIN DU PROGRAMME DE TESTS ----");
            try {
                if (cnx != null) {
                    cnx.close();
                }
            } catch (SQLException e) {
                System.err.println("Erreur de fermeture de la connexion JDBC : " + e);
            }
        }

    }

    public static void test0_Connexion() throws ClassNotFoundException, SQLException {
        Jdbc.creer("com.mysql.jdbc.Driver", "jdbc:mysql://", "localhost/", "gsb_visiteurs", "root", "");
        Jdbc.getInstance().connecter();
        Connection cnx = Jdbc.getInstance().getConnexion();
    }

    public static void test1_selectAllByMatricule(String MatriculeP) throws SQLException, ClassNotFoundException {

        List<RapportVisite> lesRapports = DaoRapportVisite.selectAllByMatricule(MatriculeP);
        System.out.println("Les rapports de visites sont : ");
        for (int i = 0; i < lesRapports.size(); i++) {
            System.out.println(lesRapports.get(i));
        }
    }

   

}
