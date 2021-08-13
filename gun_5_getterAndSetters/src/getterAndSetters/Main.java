package getterAndSetters;

public class Main {

	public static void main(String[] args) {
		
		
		Product product = new Product ("Rode NT Pro Mic", 2000, 10);
		
		Product product2 = new Product();
		product.setName("Charger");
		
		
		
		//write//set

		
		
		//read
		System.out.println(product.getDiscountedPrice());
		
		
		
		
	}

}
