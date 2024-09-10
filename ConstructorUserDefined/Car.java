package UserDefinedConstructor;

public class Car {
	String name;
	double price;
	int quantity;
	Car(){};
	Car(String name) {
		this.name = name;
	}
	Car(String name,double price) {
		this.name = name;
		this.price = price;
	}
	Car(String name,double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public void showDetails() {
		System.out.println("Vehicle is: "+ name);
		System.out.println("Price is: "+ price + "rs");
		System.out.println("Total Quantity is: "+ quantity);
		System.out.println("-----------------------------------------------------");
	}
}
