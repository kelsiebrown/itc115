// client for Product object

public class ProductMain {

	public static void main(String[] args) {
	
		// create instances of 3 products
		Product guitar = new Product(56256, "Guitar", 399.99, 12);
		Product keyboard = new Product(14673, "Keyboard", 699.99, 7);
		Product drums = new Product(58378, "Drumset", 799.99, 2);
		
		// change some prices
		guitar.setPrice(419.99);
		drums.setPrice(829.99);
		
		// display product info
		System.out.println(guitar.toString());		
		System.out.println();
		System.out.println(keyboard.toString());
		System.out.println();
		System.out.println(drums.toString());
		System.out.println();
		
		// show number of products
		System.out.println("Products available: " + Product.getCount());
		
	}
}
