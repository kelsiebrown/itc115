// represents a ticket purchased in advance
// if purchased 10+ days before event, cost is $30
// if purchased <10 days before event, cost is $40

public class AdvanceTicket extends Ticket {
	
	private double ticketPrice;
	
	public AdvanceTicket(int number, int daysBeforeEvent) {
		super(number);   // call Ticket constructor
		// determine price based on # of days before event purchased
		if (daysBeforeEvent < 10) {
			ticketPrice = 40.0;
		} else {
			ticketPrice = 30.0;
		}
	}
	
	// override super class to calculate total price
	@Override
	public double getPrice() {
		return getNumber() * ticketPrice;		
	}

}
