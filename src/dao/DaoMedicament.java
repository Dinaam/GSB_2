package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.Famille;
import metier.Medicament;



public class DaoMedicament {

    /*
     Fonction qui permet de rechercher tous les visiteurs de la base de données
     */
    public static List<Medicament> getAll() throws SQLException, ClassNotFoundException {
        List<Medicament> lesMedicaments = new ArrayList<Medicament>();
        Medicament unMedicament;
        Famille uneFamille = null;
        
//        Connection con = modele.Connect.Connection();      
//        Statement state = con.createStatement();
//        ResultSet res = state.executeQuery("SELECT * FROM visiteur");
//        System.out.println(res);
       
       
        Jdbc jdbc = Jdbc.getInstance();
        
        String requete = "SELECT * FROM medicament";
        PreparedStatement pstmt = jdbc.getConnexion().prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();

        

        while (res.next()) {
            String code = res.getString("MED_DEPOTLEGAL");
            String nom = res.getString("MED_NOMCOMMERCIAL");
            String composition = res.getString("MED_COMPOSITION");
            String effets = res.getString("MED_EFFETS");
            String contreIndic = res.getString("MED_CONTREINDIC");
            Double prix = res.getDouble("MED_PRIXECHANTILLON");
            String famCode = res.getString("FAM_CODE");
            
            uneFamille = DaoFamille.getOneByCodeFam(famCode);
            
            
            unMedicament = new Medicament(code, nom, composition, effets, contreIndic, prix, uneFamille);
            lesMedicaments.add(unMedicament);

        }
        return lesMedicaments;

    }

    
}
