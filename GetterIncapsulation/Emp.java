import java.util.Scanner;

public class Emp {
    private String name = "Ayush";
    private int id = 11;
    private double salary = 120000;
    Scanner sc= new Scanner(System.in);
    Emp() {
        checkPassword();
    }
    public void getName() {
        System.out.println("Name is:- " + name);
    }
    public void getSalary() {
        System.out.println("Salary is:- " + salary);
    }
    public void getId() {
        System.out.println("ID is:- " + id);
    }
    private boolean checkPassword() {
        System.out.println("Enter your Password");
        int p = sc.nextInt();
        if (p == 1234) {
            return true;
        }else {
            System.out.println("You have entered wrong Password.");
        }
        return false;
    }
}