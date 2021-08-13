package getterAndSetters;

public class Product {

	// fields
	private String name;
	private double unitPrice;
	private double discountRate;
	private double discountedPrice;
	
	//constructors without parameter
	public Product () {
		
	}

	// constructors
	public Product(String name, double unitPrice, double discountRate) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
		this.discountedPrice = discountedPrice;
	}

	// methods
	// read
	public String getName() {
		return name;
	}

	// write
	public void setName(String name) {
		this.name = name;
	}

	// read
	public double getUnitPrice() {
		return unitPrice;
	}

	// write
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	// read
	public double getDiscountRate() {
		return discountRate;
	}

	// write
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountedPrice() {
		return unitPrice - (unitPrice * discountRate / 100);
	}

}
