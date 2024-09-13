import java.util.Scanner;

public class Emp {
    private String name = "";
    private int id;
    private double salary;
    Scanner sc= new Scanner(System.in);
    Emp() {
        checkPassword();
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setId(int id) {
        this.id = id;
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
    public void printData() {
        System.out.println("Name is:- " + name);
        System.out.println("Id is:- " + id);
        System.out.println("Salary is:- " + salary);
    }
}