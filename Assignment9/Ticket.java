// represents a generic Ticket for a campus event

import java.text.NumberFormat;

public abstract class Ticket {
	
	private int number;
	
	public Ticket(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	// abstract method to be implemented in sub classes
	public abstract double getPrice();
	
	// method to format price
	public String formatPrice() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.getPrice());
        return formattedPrice;
	}
	
	// print as String
	@Override     // override Object class
	public String toString() {
		return ("Number: " + number + ", Price: " + formatPrice());
	}

}
