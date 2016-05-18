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
import metier.Praticien;
import metier.TypePraticien;

/**
 *
 * @author Dinam
 */
public class DaoTypePraticien{
    
    public static TypePraticien getOneByCode(String code) throws SQLException, ClassNotFoundException {
      TypePraticien unType = null;
//      Connection con = modele.Connect.Connection();      
//        Statement state = con.createStatement();
//        
//        ResultSet res = state.executeQuery("SELECT * FROM SECTEUR WHERE SEC_CODE='"+ code +"'");
      
      Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM type_praticien WHERE TYP_CODE='"+ code +"'";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
      
      if (res.next()) {
            String typCode = res.getString("TYP_CODE");
            String nom = res.getString("TYP_LIBELLE");
            String lieu = res.getString("TYP_LIEU");
            unType = new TypePraticien(typCode, nom,lieu);
           
      }
      res.close();
      pstmt.close();
    return unType;
       
      
      
  }
}

