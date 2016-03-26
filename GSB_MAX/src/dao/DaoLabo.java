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
import metier.Labo;

/**
 *
 * @author Dinam
 */
public class DaoLabo {
     public static Labo getLabo(String code) throws SQLException, ClassNotFoundException {
      Labo unLabo = null;
      
      
      
      Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM LABO WHERE LAB_CODE='"+ code +"'";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
      
      if (res.next()) {
            String lab_code = res.getString("lab_code");
            String lab_nom = res.getString("lab_nom");
            String lab_chef = res.getString("lab_chefvente");
            unLabo = new Labo(lab_code, lab_nom, lab_chef);
           
      }
    return unLabo;
       
      
      
  }
}
