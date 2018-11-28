// the Product object represents a generic product

import java.text.NumberFormat;
import java.util.UUID;

public class Product {

	// fields
	private int productCode;    // numeric product code
	private String productDescription;
	private double price;
	private int productCount;
	public static int count;
	
	// constructor
	public Product(int productCode,
			String productDescription,
			double price,
			int productCount) {
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.price = price;
		this.productCount = productCount;
		count++;
	}
	
	// getter for private price and setter to change price
	public double getPrice() {
		return this.price;
	}
	
	public void changePrice(double newPrice) {
		this.price = newPrice;
	}	
		
	// method to format price
	 public String getPriceFormatted() 
	    {
	        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
	        return formattedPrice;
	    }
	 
	 // method to convert to String and display product info
	 public String toString() {
		 return "Product: " + productDescription + "\nProduct Code: " + productCode + "\nPrice: " + 
	 getPriceFormatted() + "\nItems in stock: " + productCount;
	 }
	
}
