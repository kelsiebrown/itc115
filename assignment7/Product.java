// the Product object represents a generic product

import java.text.NumberFormat;

public class Product {

	// fields
	private int productCode;    // numeric product code
	private String productDescription;
	private double price;
	private int productCount;
	public static int count = 0;
	
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
	
	// getter and setter methods
		
	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public void setPrice(double price) {
		this.price = price;
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
