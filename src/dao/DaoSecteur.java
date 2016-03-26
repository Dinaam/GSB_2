/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import metier.Secteur;

/**
 *
 * @author Dinam
 */
public class DaoSecteur {
    
    public static Secteur getNomSecteur(String code) throws SQLException, ClassNotFoundException {
      Secteur unSecteur = null;
//      Connection con = modele.Connect.Connection();      
//        Statement state = con.createStatement();
//        
//        ResultSet res = state.executeQuery("SELECT * FROM SECTEUR WHERE SEC_CODE='"+ code +"'");
      
      Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM SECTEUR WHERE SEC_CODE='"+ code +"'";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
      
      if (res.next()) {
            String secCode = res.getString("sec_code");
            String nom = res.getString("sec_libelle");
            unSecteur = new Secteur(secCode, nom);
           
      }
    return unSecteur;
       
      
      
  }
}

