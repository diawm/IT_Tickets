import java.util.List;

import org.apache.struts2.ServletActionContext;

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
		TicketDao ticketDao = new TicketDao();
		ticketDao.saveTicket(ticket);
		return SUCCESS;
	}
	
	public String closeTicket()
	{
		TicketDao ticketDao = new TicketDao();
		String value = ServletActionContext.getRequest().getParameter("id");
		ticketDao.closeTicket(new Long(value));
		return SUCCESS;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
}
