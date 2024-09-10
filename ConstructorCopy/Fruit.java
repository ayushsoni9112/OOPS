public class Fruit {
    String name;
    double price;
    double weight;
    String color;
    Fruit(Fruit p) {
        this(p.name,p.price,p.weight,p.color);
    }
    Fruit() {}
    Fruit(String name) {
        this();
        this.name = name;
    }
    Fruit(String name,double price) {
        this(name);
        this.price = price;
    }
    Fruit(String name, double price, double weight) {
        this(name, price);
        this.weight = weight;
    }    
    Fruit(String name,double price,double weight,String color) {
        this(name,price,weight);
        this.color = color;
    }
    public void setValue() {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Weight: "+weight);
        System.out.println("Color: "+color);
        System.out.println("---------------------------------------------------------");
    }
}