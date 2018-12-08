// client for Ticket class

public class TicketMain {

	public static void main(String[] args) {

		// create array of tickets
		Ticket[] tickets = new Ticket[4];
		tickets[0] = new WalkupTicket(6);
		tickets[1] = new WalkupTicket(1);
		tickets[2] = new AdvanceTicket(1, 12);
		tickets[3] = new AdvanceTicket(1, 8);
		
		// print ticket info
		for (int i = 0; i < tickets.length; i++) {
			System.out.println(tickets[i].toString());
			System.out.println();
		}
		
	}

}
