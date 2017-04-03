import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TicketAction extends ActionSupport {
	
	private Ticket ticket;
	private List<Ticket> tickets;
	
	public String execute() {
		TicketDao ticketDao = new TicketDao();
		tickets = ticketDao.getTickets();
		return SUCCESS;
	}
	
	public String showOpenedTickets() {
		TicketDao ticketDao = new TicketDao();
		tickets = ticketDao.getOpenedTickets();
		return SUCCESS;
	}
	
	public String showClosedTickets() {
		TicketDao ticketDao = new TicketDao();
		tickets = ticketDao.getClosedTickets();
		return SUCCESS;
	}


	public String showModifyTickets() {
		TicketDao ticketDao = new TicketDao();
		tickets = ticketDao.getModifyTickets();
		return SUCCESS;
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
		ticketDao.closeTicket(value);
		return SUCCESS;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}


	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	


	public List<Ticket> getTickets() {
		return tickets;
	}
	
	
}
