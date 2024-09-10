public class E extends B {
    int a = 50;
    int b = 60;
    public void test() {
        int a = 80;
        int b = 90;
        System.out.println("Local a is: "+a);
        System.out.println("Local b is: "+b);
        System.out.println("Globle a from same class is: "+this.a);
        System.out.println("Globle b from same class is: "+this.b);
        System.out.println("a from Parent class is: "+super.a);
        System.out.println("b from Parent class is: "+super.b);
        System.out.println("a from A class is: "+getAFromA());
        System.out.println("b from A class is: "+getBFromA());
        System.out.println("------------------------------------------------------");
    }
}
