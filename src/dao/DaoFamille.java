/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import metier.Famille;
import metier.Medicament;
import metier.Praticien;
import metier.TypePraticien;

/**
 *
 * @author Dinam
 */
public class DaoFamille {
    
    public static Famille getOneByCodeFam(String code) throws SQLException, ClassNotFoundException {
        Medicament unMedicament = null;
        Famille uneFamille = null;
        
//        Connection con = modele.Connect.Connection();      
//        Statement state = con.createStatement();
//        
//        ResultSet res = state.executeQuery("SELECT * FROM visiteur WHERE VIS_NOM='"+ login +"'");
        Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM famille where FAM_CODE ='"+ code +"'";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
        
        

        while (res.next()) {
            String famCode = res.getString("FAM_CODE");
            String libelle = res.getString("FAM_LIBELLE");
            
            uneFamille= new Famille(famCode,libelle);

        }
        return uneFamille;
    }
}
