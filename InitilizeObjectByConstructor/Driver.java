public class Driver {
    public static void main(String[] args) {
        Car c1 = new Car("Maruti","Swift",120000,"White");
        Car c2 = new Car("Mahindra","Thar",100000,"Black");

        System.out.println("c1's brand is: "+c1.brand);
        System.out.println("c1's color is: "+c1.color);
        System.out.println("c1's price is: "+c1.price);
        System.out.println("c1's model is: "+c1.model);
        System.out.println("--------------------------------------");
        System.out.println("c2's brand is: "+c2.brand);
        System.out.println("c2's color is: "+c2.color);
        System.out.println("c2's price is: "+c2.price);
        System.out.println("c2's model is: "+c2.model);
    }
}
