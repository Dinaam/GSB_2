package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import metier.RapportVisite;

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
    public static RapportVisite selectOnByMatricule(String matriculeP) throws SQLException, ClassNotFoundException
    {
        RapportVisite unRapportVisite = null;
        
        
        Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM RapportVisite WHERE VIS_MATRICULE ='"+ matriculeP +"'";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
        
        while (res.next()) {
            String matricule = res.getString("VIS_MATRICULE");
            int numRap = res.getInt("RAP_NUM");
        }
        
        return unRapportVisite;
        
    }
    
}
