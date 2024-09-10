package UserDefinedConstructor;

public class Driver {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Maruti Suzuki");
		Car c3 = new Car("Thar",1000000);
		Car c4 = new Car("Scorpio",2000000,3);
		c1.showDetails();
		c2.showDetails();
		c3.showDetails();
		c4.showDetails();
	}
}
