import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TicketAction extends ActionSupport {
	
	private Ticket ticket;
	
	public List<Ticket> getTickets() {
		TicketDao ticketDao = new TicketDao();
		return ticketDao.getTickets();
	}
	
	public String saveTicket()
	{
		System.out.println("sauvegarde dans la base de donnees");
		System.out.println("panne "+ticket.getPanne());
		System.out.println("commentaire "+ticket.getCommentaire());
		TicketDao ticketDao = new TicketDao();
		ticketDao.saveTicket(ticket);
		return SUCCESS;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
}
