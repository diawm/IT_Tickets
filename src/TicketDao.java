import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketDao {

	public List<Ticket> getTickets() {
		
    	  List<Ticket> tickets = new ArrayList<Ticket>();
		  Connection con = null;  
	      Statement stmt = null;  
	      ResultSet rs = null;  
	      try {  
	         con = getConnection();  
	         String SQL = "SELECT ID_Ticket, PANNE, COMMENTAIRE, Traitement, Heure_signalisation, heure_fermeture FROM IT_Tickets";  
	         stmt = con.createStatement();  
	         rs = stmt.executeQuery(SQL);  
	         while (rs.next()) {
	        	Ticket ticket = new Ticket();
	        	ticket.setId(rs.getLong(1));
	        	ticket.setPanne(rs.getString(2));
	        	ticket.setCommentaire(rs.getString(3));
	        	ticket.setTraitement(rs.getString(4));
	        	ticket.setDate_signalisation(rs.getTimestamp(5));
	        	ticket.setDate_fermeture(rs.getTimestamp(6));
	        	tickets.add(ticket);
	         }  
	      }  
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
	
	public void closeTicket(long id){
		Connection con = null;  
	      PreparedStatement stmt = null;   

	      try {  
	         con = getConnection();  
	         String SQL = "update IT_Tickets set heure_fermeture=? where id_ticket=?;";  
	         stmt = con.prepareStatement(SQL);
	         stmt.setTimestamp(1, new Timestamp(new Date().getTime()));
	         stmt.setLong(2, id);
	         stmt.execute();
	      }  
	      catch (Exception e) {  
	         e.printStackTrace();  
	      }  
	      finally {  
	         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
	         if (con != null) try { con.close(); } catch(Exception e) {}  
	      }  
		
	}
	
	public void saveTicket(Ticket ticket){
		
		  Connection con = null;  
	      PreparedStatement stmt = null;   

	      try {  
	         con = getConnection();  
	         String SQL = "insert into IT_Tickets(ID_STAFF,PANNE,COMMENTAIRE,Traitement, heure_signalisation) values(?,?,?,?,?);";  
	         stmt = con.prepareStatement(SQL);
	         stmt.setInt(1, 123466665);
	         stmt.setString(2, ticket.getPanne());
	         stmt.setString(3, ticket.getCommentaire());
	         stmt.setString(4, ticket.getTraitement());
	         stmt.setTimestamp(5,new Timestamp(new Date().getTime()));
	         stmt.execute();
	      }  
	      catch (Exception e) {  
	         e.printStackTrace();  
	      }  
	      finally {  
	         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
	         if (con != null) try { con.close(); } catch(Exception e) {}  
	      }  
	}
	
	private Connection getConnection() throws Exception {
	      Class.forName("com.mysql.cj.jdbc.Driver");  
	      return DriverManager.getConnection("jdbc:mysql://localhost/idptest","root","passer");  
	}
}
