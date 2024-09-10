public class Driver {
    static {
        System.out.println("This is Static block 1 from Driver Class");
    }
    public static void main(String[] args) {
        new C();
        System.out.println("This is main method");
    }
    static {
        System.out.println("This is Static block 2 from Driver Class");
    }    
}