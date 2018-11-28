// client for Product class

public class ProductMain {

	public static void main(String[] args) {
	
		// create instances of 3 products
		Product guitar = new Product(56256, "Guitar", 399.99, 12);
		Product keyboard = new Product(14673, "Keyboard", 699.99, 7);
		Product drums = new Product(58378, "Drumset", 799.99, 2);
		
		// change some prices
		guitar.changePrice(419.99);
		drums.changePrice(829.99);
		
		// display product info
		System.out.println(guitar.toString());
		System.out.println();
		System.out.println(keyboard.toString());
		System.out.println();
		System.out.println(drums.toString());
		System.out.println();
		
		// show number of products
		System.out.println("Products available: " + Product.count);
		
	}
}
