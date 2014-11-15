//STEP 1. Import required packages
import java.sql.*;

public class JDBCExample {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "net.ucanaccess.jdbc.UcanaccessDriver";  
   static final String DB_URL = "jdbc:ucanaccess://C:/Users/Shana/Documents/UMW/Fall 2014/CPSC330/CPSC330.accdb";

   //  Database credentials
      static final String USER = "";
      static final String PASS = "";
   
   public static void main(String[] args) {
   Connection conn = null; //DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Shana/Documents/UMW/Fall 2014/CPSC330/CPSC330.accdbc");
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample