import controleur.CtrlConnexion;
import controleur.CtrlVisiteurs;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dao.Jdbc;
import vues.VueConnexion;
import vues.VueVisiteur;
import vues.VuePracticiens;

/**
 *
 * @author btssio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
       // Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@172.15.11.102:1521:orcl", "", "ora_2slamppe_eq3", "equipe03");

       Jdbc.creer("com.mysql.jdbc.Driver", "jdbc:mysql:", "//localhost/", "gsb", "root", "mysql");

        try {
            Jdbc.getInstance().connecter();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Main - classe JDBC non trouvée");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Main - échec de connexion");
        }
         //afficher la vue
        VueConnexion vue = new VueConnexion();
        CtrlConnexion ctrl = new CtrlConnexion(vue);
        vue.setVisible(true);
        
//        VueVisiteur vue = new VueVisiteur();
//        CtrlVisiteurs ctrlVis = new CtrlVisiteurs(vue);
//        // afficher la vue
//        vue.setVisible(true);
    }
    
}
