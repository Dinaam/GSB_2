package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.Praticien;
import metier.RapportVisite;
import metier.Visiteur;

/**
 * DAO RapportVisite
 * @author Maxime
 */
public class DaoRapportVisite {
    
    /**
     * @param matriculeP
     * @return RapportVisite by Matricule
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static List<RapportVisite> selectAllByMatricule(String matriculeP) throws SQLException, ClassNotFoundException
    {
        List<RapportVisite> lesRapportsVisites  = new ArrayList<RapportVisite>();
        RapportVisite unRapport = null;
        Visiteur unVisiteur;
        Praticien unPraticien;
                
        Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM rapport_visite WHERE VIS_MATRICULE ='"+ matriculeP +"'";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
        
        while (res.next()) {
            int rapNum = res.getInt("RAP_NUM");
            int praNum = res.getInt("PRA_NUM");
            Date rapDate = res.getDate("RAP_DATE");
            String rapBilan = res.getString("RAP_BILAN");
            String rapMotif = res.getString("RAP_MOTIF");
            
            unPraticien = DaoPraticien.selectOneByNum(praNum);
            unVisiteur = DaoVisiteurs.selectOneByMat(matriculeP);
            
            unRapport= new RapportVisite(unVisiteur,rapNum,unPraticien,rapDate,rapBilan, rapMotif);
            lesRapportsVisites.add(unRapport);
        }
        
        return lesRapportsVisites;
        
    }
    
    /**
     * 
     */
    public static void insertDatabase(String matriculeP, String Rapnum, int PraNum, String rapBilan, String rapMotif) throws SQLException, ClassNotFoundException
    {
        
        Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "INSERT INTO RAPPORT_VISITE (VIS_MATRICULE, RAP_NUM, PRA_NUM, RAP_BILAN, RAP_MOTIF) VALUES ('"+matriculeP+"', '"+Rapnum+"', '"+PraNum+"', '"+rapBilan+"', '"+rapMotif+"') ";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.executeUpdate();
    }
    
}
