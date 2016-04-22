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
import dao.DaoLabo;
import dao.DaoMedicament;
import dao.DaoPraticien;
import dao.DaoSecteur;
import dao.DaoTypePraticien;
import dao.DaoVisiteurs;
import dao.Jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import metier.Famille;
import metier.Labo;
import metier.Medicament;
import metier.Praticien;
import metier.Secteur;
import metier.TypePraticien;
import metier.Visiteur;

/**
 *
 * @author btssio
 */
public class TestDaoLabo{

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        java.sql.Connection cnx = null;

        try {
            System.out.println("---- DEBUT DU PROGRAMME DE TESTS ----");
            System.out.println("Test0 : connexion");
            test0_Connexion();
            System.out.println("Test0 : effectué");
            System.out.println("Test1 : selectOne");
            test1_getLaboByCode("BC");
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

    public static void test1_getLaboByCode(String code) throws SQLException, ClassNotFoundException {

        Labo unLabo = DaoLabo.getLabo(code);
        System.out.println("Le labo qui a pour code : " + code + " est : \n" + unLabo.toString2());

    }
}
