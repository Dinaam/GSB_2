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
import metier.Praticien;
import metier.TypePraticien;

public class DaoPraticien {
    
    /*
     Fonction qui permet de rechercher tous les visiteurs de la base de données
     */
    public static List<Praticien> getAll() throws SQLException, ClassNotFoundException {
        List<Praticien> lesPraticiens = new ArrayList<Praticien>();
        Praticien unPraticien;
        TypePraticien unType;
        
//        Connection con = modele.Connect.Connection();      
//        Statement state = con.createStatement();
//        ResultSet res = state.executeQuery("SELECT * FROM visiteur");
//        System.out.println(res);
       
       
        Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM praticien";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();

        

        while (res.next()) {
            int num = res.getInt("PRA_NUM");
            String nom = res.getString("PRA_NOM");
            String prenom = res.getString("PRA_PRENOM");
            String adresse = res.getString("PRA_ADRESSE");
            String cp = res.getString("PRA_CP");
            String ville = res.getString("PRA_VILLE");
            Float coeff = res.getFloat("PRA_COEFNOTORIETE");
            String typCode = res.getString("TYP_CODE");
            
            unType = DaoTypePraticien.getOneByCode(typCode);
            
            unPraticien= new Praticien(num, nom, prenom, adresse, cp, ville, coeff, unType);
            lesPraticiens.add(unPraticien);

        }
        return lesPraticiens;

    }

    public static Praticien selectOneByName(String name) throws SQLException, ClassNotFoundException {
        Praticien unPraticien = null;
        TypePraticien unType = null;
        
//        Connection con = modele.Connect.Connection();      
//        Statement state = con.createStatement();
//        
//        ResultSet res = state.executeQuery("SELECT * FROM visiteur WHERE VIS_NOM='"+ login +"'");
        Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM praticien where PRA_NOM ='"+ name +"'";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
        
        

        while (res.next()) {
            int num = res.getInt("PRA_NUM");
            String nom = res.getString("PRA_NOM");
            String prenom = res.getString("PRA_PRENOM");
            String adresse = res.getString("PRA_ADRESSE");
            String cp = res.getString("PRA_CP");
            String ville = res.getString("PRA_VILLE");
            Float coeff = res.getFloat("PRA_COEFNOTORIETE");
            String typCode = res.getString("TYP_CODE");
            
            unType = DaoTypePraticien.getOneByCode(typCode);
            
            unPraticien= new Praticien(num, nom, prenom, adresse, cp, ville, coeff, unType);

        }
        return unPraticien;
    }
    public static Praticien selectOneByNum(int num) throws SQLException, ClassNotFoundException {
        Praticien unPraticien = null;
        TypePraticien unType = null;
        
//        Connection con = modele.Connect.Connection();      
//        Statement state = con.createStatement();
//        
//        ResultSet res = state.executeQuery("SELECT * FROM visiteur WHERE VIS_NOM='"+ login +"'");
        Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM praticien where PRA_NUM ='"+ num +"'";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
        
        

        while (res.next()) {
            String nom = res.getString("PRA_NOM");
            String prenom = res.getString("PRA_PRENOM");
            String adresse = res.getString("PRA_ADRESSE");
            String cp = res.getString("PRA_CP");
            String ville = res.getString("PRA_VILLE");
            Float coeff = res.getFloat("PRA_COEFNOTORIETE");
            String typCode = res.getString("TYP_CODE");
            
            unType = DaoTypePraticien.getOneByCode(typCode);
            
            unPraticien= new Praticien(num, nom, prenom, adresse, cp, ville, coeff, unType);

        }
        
        res.close();
        pstmt.close();
        
        return unPraticien;
    }
}
