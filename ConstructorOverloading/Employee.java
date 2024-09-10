public class Employee {
    String name;
    int age;
    long mobNo;
    Employee() {};
    Employee(String name) {
        this.name = name;
    }
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Employee(String name, int age, long mobNo) {
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }
    public void setValue() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Mobile no: "+mobNo);
    }
}