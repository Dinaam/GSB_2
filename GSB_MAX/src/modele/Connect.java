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
//private static Connection singleton = null;
//
//  public static Connection Connection() throws SQLException, ClassNotFoundException {
////      Class.forName("com.mysql.jdbc.Driver");
////            
////            
////            String url = "jdbc:mysql://localhost:3306/gsb_visiteurs?zeroDateTimeBehavior=convertToNull";
////            String user = "root";
////            String password = "";
//            
//Class.forName("oracle.jdbc.driver.OracleDriver");
//      
//      String url = "jdbc:oracle:thin:@172.15.11.102:1521:orcl";
//      String user = "ora_2slamppe_eq3";
//      String password = "equipe03";
//      
//   Connection con = DriverManager.getConnection(url, user, password);
//   
//      return con;
//  }
//}