import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
public class Example { 
 public static void main(String[] args) { 
 System.out.println("Inside the Main function"); 
 String url = "jdbc:mysql://localhost:3306/test123"; 
 String dusername = "root"; 
 String dpassword = ""; 
 // using try-with-resources to avoid closing resources (boilerplate code) 
 // Step 1: Establishing a Connection 
 
 try (Connection connection = DriverManager 
		 .getConnection(url, dusername, dpassword); 
		 // Step 2:Create a statement using connection object 
		 Statement stmt = connection.createStatement(); 
		 // Step 3: Execute the query or update query 
		 ResultSet rs = stmt.executeQuery("select id,name,email,country,password from Users")) { 
		 // Step 4: Process the ResultSet object. 
		 while (rs.next()) { 
		 int id = rs.getInt("id"); 
		 String name = rs.getString("name"); 
		 String email = rs.getString("email"); 
		 String country = rs.getString("country"); 
		 String password = rs.getString("password"); 
		 System.out.println(id + "," + name + "," + email + "," + country + "," + password); 
		 } 
		 } catch (SQLException e) { 
		 // printSQLException(e); 
		 System.out.println("An error occurred while connecting MySQL databse"); 
		 e.printStackTrace(); 
		 } 
		 // Step 4: try-with-resource statement will auto close the connection. 
		 finally{ 
		 System.out.println("Finally Done, Phew ! "); 
		 } 
		 } 
		 public static void printSQLException(SQLException ex) { 
		 for (Throwable e: ex) { 
		 if (e instanceof SQLException) { 
		 e.printStackTrace(System.err); 
		 System.err.println("SQLState: " + ((SQLException) e).getSQLState()); 
		 System.err.println("Error Code: " + ((SQLException) e).getErrorCode()); 
		 System.err.println("Message: " + e.getMessage()); 
		 Throwable t = ex.getCause(); 
		 while (t != null) { 
		 System.out.println("Cause: " + t); 
		 t = t.getCause(); 
		 } 
		 } 
		 } 
		 } 
		} 