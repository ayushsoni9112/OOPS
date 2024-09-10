public class Driver {
    public static void main(String[] args) {
        System.out.println(mul(4,6));
        System.out.println(mul(4,6,8));
        System.out.println(mul(6.87,9));
        System.out.println(mul(6.87,9,8.88));
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int mul(int a, int b,int c) {
        return a * b * c;
    }
    public static double mul(double a, int b) {
        return a * b;
    }
    public static double mul(double a, int b, double c) {
        return a * b * c;
    }
}