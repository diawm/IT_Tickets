import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TicketDao {

	public List<Ticket> getTickets() {
		
		// Create a list of tickets.
		 List<Ticket> tickets = new ArrayList<Ticket>();
		 
		// Create a variable for the connection string.  
	      String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
	         "databaseName=AdventureWorks;user=UserName;password=*****";  

	      // Declare the JDBC objects.  
	      Connection con = null;  
	      Statement stmt = null;  
	      ResultSet rs = null;  

	      try {  
	         // Establish the connection.  
	         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	         con = DriverManager.getConnection(connectionUrl);  

	         // Create and execute an SQL statement that returns some data.  
	         String SQL = "SELECT TOP 10 * FROM Person.Contact";  
	         stmt = con.createStatement();  
	         rs = stmt.executeQuery(SQL);  

	         // Iterate through the data in the result set and add the tickets.  
	         while (rs.next()) {
	        	Ticket ticket = new Ticket();
	        	ticket.setId(rs.getString(1));
	        	ticket.setPanne(rs.getString(2));
	         }  
	      }  

	      // Handle any errors that may have occurred.  
	      catch (Exception e) {  
	         e.printStackTrace();  
	      }  
	      finally {  
	         if (rs != null) try { rs.close(); } catch(Exception e) {}  
	         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
	         if (con != null) try { con.close(); } catch(Exception e) {}  
	      }  
		 return tickets;
	}
}
