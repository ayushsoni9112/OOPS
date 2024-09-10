public class Driver {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        Fruit f3 = new Fruit();
        f1.setVal("Apple", 100);
        f2.setVal("Banana", 40);
        f3.setVal("Orange", 60);

        System.out.println("f1's name is: "+f1.name);
        System.out.println("f1's price is: "+f1.price+"rs");
        System.out.println("-------------------------------------");
        System.out.println("f2's name is: "+f2.name);
        System.out.println("f2's price is: "+f2.price+"rs");
        System.out.println("-------------------------------------");
        System.out.println("f3's name is: "+f3.name);
        System.out.println("f3's price is: "+f3.price+"rs");
        System.out.println("-------------------------------------");
    }
}