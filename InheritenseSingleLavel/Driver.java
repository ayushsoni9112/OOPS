public class Driver {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        System.out.println("Vehicle's a is: "+v1.a);
        System.out.println("Vehicle's b is: "+v1.b);
        Car c1 = new Car();
        System.out.println("Car's x is: "+ c1.x);
        System.out.println("Car's y is: "+ c1.y);
        System.out.println("A from car is: "+c1.a);
        System.out.println("B from car is: "+c1.b);
    }
}
