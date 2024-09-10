public class Driver {
    public static void main(String[] args) {
        Fruit f1 = new Banana();
        Fruit f2 = new Apple();
        Fruit f3 = new Orange();
        Banana b1 = (Banana) f1;
        Apple a1 = (Apple) f2;
        Orange o1 = (Orange) f3;
        b1.color();
        a1.color();
        o1.color();
    }
}