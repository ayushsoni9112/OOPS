public class D extends C {
    int a = 70;
    int b = 80;
    public void Demo() {
        System.out.println("This is D class-");
        System.out.println("a from D class is: "+this.a);
        System.out.println("b from D class is: "+this.b);
        System.out.println("a from C class is: "+super.a);
        System.out.println("b from C class is: "+super.b);
        System.out.println("a form B class is: "+ getAFromB());
        System.out.println("b form B class is: "+ getBFromB());
        System.out.println("a form A class is: "+ getAFromA());
        System.out.println("b form A class is: "+ getBFromA());
    }
}
