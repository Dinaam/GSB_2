//package modele;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Connect {
//
//  public static Connection Connection() throws SQLException, ClassNotFoundException {
//    
//      Class.forName("com.mysql.jdbc.Driver");
//            
//            
//            String url = "jdbc:mysql://localhost:3306/gsb_visiteurs?zeroDateTimeBehavior=convertToNull";
//            String user = "root";
//            String password = "";
//
//      Connection con = DriverManager.getConnection(url, user, password);
//      
//      
//         
//       
//      return con;
//      
//  }
//}