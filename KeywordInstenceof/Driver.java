public class Driver {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Object o1 = new Car();
        Object a = 30;

        System.out.println(v1 instanceof Car);  // true
        System.out.println(v1 instanceof Bike);  // false
        System.out.println(v2 instanceof Car);  // false
        System.out.println(v2 instanceof Bike);  // true
        System.out.println(o1 instanceof Bike);  // false
        System.out.println(o1 instanceof Car);   // true
        System.out.println(o1 instanceof Vehicle); // true
        System.out.println(a instanceof Integer); // true
        System.out.println(a instanceof Double); //false
    }
}
