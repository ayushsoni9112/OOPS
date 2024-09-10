public class Driver {
    {
        System.out.println("This is non-Static block 1 from Driver Class");
    }
    public static void main(String[] args) {
        new C();
        new Driver();
        System.out.println("This is main method");
    }
    {
        System.out.println("This is non-Static block 2 from Driver Class");
    }    
}