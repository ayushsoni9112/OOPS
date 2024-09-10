public class Driver {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Child();
        p1.test();
        p2.test();
    }
}
