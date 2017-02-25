import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TicketAction extends ActionSupport {
	
	public List<Ticket> getTickets() {
		TicketDao ticketDao = new TicketDao();
		return ticketDao.getTickets();
	}
}
