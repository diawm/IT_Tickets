import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TicketDao {

	public List<Ticket> getTickets() {
		
		// Create a list of tickets.
		 List<Ticket> tickets = new ArrayList<Ticket>();
		 
		// Create a variable for the connection string.  
	      String connectionUrl = "jdbc:mysql://localhost/idptest";  

	      // Declare the JDBC objects.  
	      Connection con = null;  
	      Statement stmt = null;  
	      ResultSet rs = null;  

	      try {  
	         // Establish the connection.  
	         Class.forName("com.mysql.cj.jdbc.Driver");  
	         con = DriverManager.getConnection(connectionUrl,"root","passer");  

	         // Create and execute an SQL statement that returns the tickets.  
	         String SQL = "SELECT ID_Ticket, PANNE, COMMENTAIRE FROM IT_Tickets";  
	         stmt = con.createStatement();  
	         rs = stmt.executeQuery(SQL);  

	         // Iterate through the data in the result set and add the tickets.  
	         while (rs.next()) {
	        	Ticket ticket = new Ticket();
	        	ticket.setId(rs.getString(1));
	        	ticket.setPanne(rs.getString(2));
	        	ticket.setCommentaire(rs.getString(3));
	        	tickets.add(ticket);
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
	
	public void saveTicket(Ticket ticket){
		
		// Create a variable for the connection string.  
	      String connectionUrl = "jdbc:mysql://localhost/idptest";  

	      // Declare the JDBC objects.  
	      Connection con = null;  
	      PreparedStatement stmt = null;   

	      try {  
	         // Establish the connection.  
	         Class.forName("com.mysql.cj.jdbc.Driver");  
	         con = DriverManager.getConnection(connectionUrl,"root","passer");  

	         // Create and execute a prepared SQL statement to insert the values.  
	         String SQL = "insert into IT_Tickets(ID_STAFF,PANNE,COMMENTAIRE) values(?,?,?);";  
	         stmt = con.prepareStatement(SQL);
	         stmt.setInt(1, 123466665);
	         stmt.setString(2, ticket.getPanne());
	         stmt.setString(3, ticket.getCommentaire());
	         stmt.execute();
	      }  

	      // Handle any errors that may have occurred.  
	      catch (Exception e) {  
	         e.printStackTrace();  
	      }  
	      finally {  
	         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
	         if (con != null) try { con.close(); } catch(Exception e) {}  
	      }  
	}
}
