package entities;

public class Product {
 
	String name;
	double prince;
	int quantity;
	
	public double TotalValueInStock() {;
	 return prince * quantity;
	}
	
	public void addProducts(int quantity) {
	 this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
