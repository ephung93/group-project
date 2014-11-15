import java.sql.*;

/**
   Insert class that inserts into DB
*/

public class Insert{

   
   //inserts into users table
   public static void insertUser(String uName, String fName, String lName, String pWord)
   {
   
          Connection conn = null;
		    PreparedStatement ps = null;
          try{
                //variables containing passed in values 
                String userName = uName;
      			 String firstName = fName;
      			 String lastName = lName;
      			 String passWord = pWord;
                
                conn = DBConnection.getConnection();
   			    System.out.println("Inserting records into the table...");
   			    String query = "INSERT INTO users " + "VALUES(?, ?, ?, ?, ?, ?)";
   			    ps = conn.prepareStatement(query);
   			    ps.setNull(1, java.sql.Types.INTEGER);
   			    ps.setString(2, userName);
   			    ps.setString(3, firstName);
      			 ps.setString(4, lastName);
      			 ps.setString(5, passWord);
      			 ps.setString(6, "true");
      			 ps.executeUpdate();
            		}catch(SQLException se){
            		      //Handle errors for JDBC
            		      se.printStackTrace();
            		   }catch(Exception e){
            		      //Handle errors for Class.forName
            		      e.printStackTrace();
            		   }finally{
            		      //finally block used to close resources
            		      try{
            		         if(ps!=null)
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

         
   
   }





}


