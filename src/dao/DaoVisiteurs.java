package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import metier.Labo;
import metier.Visiteur;
import metier.Secteur;

public class DaoVisiteurs {

    /*
     Fonction qui permet de rechercher tous les visiteurs de la base de données
     */
    public static List<Visiteur> getAll() throws SQLException, ClassNotFoundException {
        List<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
        Visiteur unVisiteur;
        Secteur unSecteur = null;
        Labo unLabo = null;
        
//        Connection con = modele.Connect.Connection();      
//        Statement state = con.createStatement();
//        ResultSet res = state.executeQuery("SELECT * FROM visiteur");
//        System.out.println(res);
       
       
        Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM visiteur";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();

        

        while (res.next()) {
            String matricule = res.getString("VIS_MATRICULE");
            String nom = res.getString("VIS_NOM");
            String prenom = res.getString("Vis_PRENOM");
            String adresse = res.getString("VIS_ADRESSE");
            String cp = res.getString("VIS_CP");
            String ville = res.getString("VIS_VILLE");
            Date date = res.getDate("VIS_DATEEMBAUCHE");
            String secCode = res.getString("SEC_CODE");
            String labCode = res.getString("LAB_CODE");
            unSecteur = DaoSecteur.getNomSecteur(secCode);
            unLabo = DaoLabo.getLabo(labCode);
            unVisiteur = new Visiteur(matricule, nom, prenom, adresse, cp, ville, date, unSecteur, unLabo);
            lesVisiteurs.add(unVisiteur);

        }
        return lesVisiteurs;

    }

    public static Visiteur selectOneByLogin(String login) throws SQLException, ClassNotFoundException {
        Visiteur unVisiteur = null;
        Secteur unSecteur = null;
        Labo unLabo = null;
        
//        Connection con = modele.Connect.Connection();      
//        Statement state = con.createStatement();
//        
//        ResultSet res = state.executeQuery("SELECT * FROM visiteur WHERE VIS_NOM='"+ login +"'");
        Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM visiteur where VIS_NOM ='"+ login +"'";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
        
        

        while (res.next()) {
            String matricule = res.getString("VIS_MATRICULE");
            String nom = res.getString("VIS_NOM");
            String prenom = res.getString("Vis_PRENOM");
            String adresse = res.getString("VIS_ADRESSE");
            String cp = res.getString("VIS_CP");
            String ville = res.getString("VIS_VILLE");
            Date date = res.getDate("VIS_DATEEMBAUCHE");
            String secCode = res.getString("SEC_CODE");
            String labCode = res.getString("LAB_CODE");
            unSecteur = DaoSecteur.getNomSecteur(secCode);
            unLabo = DaoLabo.getLabo(labCode);
            unVisiteur = new Visiteur(matricule, nom, prenom, adresse, cp, ville, date, unSecteur, unLabo);

        }
        return unVisiteur;
    }
    public static Visiteur selectOneByMat(String matricule) throws SQLException, ClassNotFoundException {
        Visiteur unVisiteur = null;
        Secteur unSecteur = null;
        Labo unLabo = null;
        
//        Connection con = modele.Connect.Connection();      
//        Statement state = con.createStatement();
//        
//        ResultSet res = state.executeQuery("SELECT * FROM visiteur WHERE VIS_NOM='"+ login +"'");
        Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM visiteur where VIS_MATRICULE ='"+ matricule +"'";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
        
        

        while (res.next()) {
            String nom = res.getString("VIS_NOM");
            String prenom = res.getString("Vis_PRENOM");
            String adresse = res.getString("VIS_ADRESSE");
            String cp = res.getString("VIS_CP");
            String ville = res.getString("VIS_VILLE");
            Date date = res.getDate("VIS_DATEEMBAUCHE");
            String secCode = res.getString("SEC_CODE");
            String labCode = res.getString("LAB_CODE");
            unSecteur = DaoSecteur.getNomSecteur(secCode);
            unLabo = DaoLabo.getLabo(labCode);
            unVisiteur = new Visiteur(matricule, nom, prenom, adresse, cp, ville, date, unSecteur, unLabo);

        }
        return unVisiteur;
    }
}
