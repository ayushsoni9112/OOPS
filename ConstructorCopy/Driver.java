public class Driver {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Banana",120,3.5,"Yellow");
        Fruit f2 = new Fruit("Apple",100);
        Fruit f3 = new Fruit(f1);
        f1.setValue();
        f2.setValue();
        f3.setValue();
    }   
}
