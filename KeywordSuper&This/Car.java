public class Car extends Vehicle {
    int a = 20;
    int b = 40;
    public void setValue() {
        int a = 100;
        int b = 150;
        System.out.println("Local a is: "+a);
        System.out.println("Local b is: "+b);
        System.out.println("Globle a is: "+this.a);
        System.out.println("Globle b is: "+this.b);
        System.out.println("a form Vehicle class is: "+super.a);
        System.out.println("b form Vehicle class is: "+super.b);
    }
}