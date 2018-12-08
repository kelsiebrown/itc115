// represents a walk-up ticket purchased day of event

public class WalkupTicket extends Ticket {

	private double ticketPrice;
	
	public WalkupTicket(int number) {
		super(number);     // call Ticket constructor
		ticketPrice = 50.0;
	}

	// override Ticket super class to calculate price
	@Override
	public double getPrice() {
		return getNumber() * ticketPrice;
	}

}
