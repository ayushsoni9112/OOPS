public class Driver {
    public static void main(String[] args) {
        System.out.println(add(4,6));
        System.out.println(add(4,6,8));
        System.out.println(add(6.87,9));
        System.out.println(add(6.87,9,8.88));
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b,int c) {
        return a + b + c;
    }
    public static double add(double a, int b) {
        return a + b;
    }
    public static double add(double a, int b, double c) {
        return a + b + c;
    }
}