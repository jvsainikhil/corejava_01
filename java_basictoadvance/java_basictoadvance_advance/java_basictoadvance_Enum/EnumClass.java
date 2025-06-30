package java_basictoadvance_Enum;

enum LaptopPurchase { // prebuild
	Mackbook(2000), Xps(2200), Surface, ThinkPad(1800);

	private int price;

	// Constructor using Fields
	private LaptopPurchase(int price) {
		this.price = price;
		System.out.println("in Laptop"+this.price);
	}
	
	private LaptopPurchase() {
		price = 500;
	}

	// ----------------------------------------
	
	// Getters and Setters
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

//Extends not work in enum but we can create constructors & variables
public class EnumClass {
	public static void main(String[] args) {
		//LaptopPurchase lap = LaptopPurchase.Mackbook;
	    //System.out.println(lap + " : "+ lap.getPrice());
		for (LaptopPurchase lap : LaptopPurchase.values()) {
			//System.out.println(lap + " : " + lap.getPrice());
		}
	}
}