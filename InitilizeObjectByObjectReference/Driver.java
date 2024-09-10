public class Driver {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();

        l1.brand = "HP";
        l1.price = 34000;
        l1.ram = 8;
        l1.storage = 256;

        l2.brand = "Dell";
        l2.price = 52000;
        l2.ram = 16;
        l2.storage = 512;

        System.out.println("l1's brand is: " + l1.brand);
        System.out.println("l1's price is: " + l1.price);
        System.out.println("l1's ram is: " + l1.ram + "gb");
        System.out.println("l1's storage is: " + l1.storage + "gb");
        System.out.println("----------------------------------------------------");
        System.out.println("l2's brand is: " + l2.brand);
        System.out.println("l2's price is: " + l2.price);
        System.out.println("l2's ram is: " + l2.ram + "gb");
        System.out.println("l2's storage is: " + l2.storage + "gb");
    }
}
