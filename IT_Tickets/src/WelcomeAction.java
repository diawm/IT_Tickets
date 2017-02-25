import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {

	public String execute() {
		System.out.println("working");
		return SUCCESS;
	}
	
	public List<Ticket> getTickets() {
		List<Ticket> tickets = new ArrayList<Ticket>();
		Ticket ticket1 = new Ticket();
		ticket1.setId("12456GGGGFFE");
		ticket1.setPanne("wifi non connecte");
		tickets.add(ticket1);
		return tickets;
	}
}
