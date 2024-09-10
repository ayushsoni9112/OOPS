public class Driver {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ayush");
        Employee e3 = new Employee("Manish",21);
        Employee e4 = new Employee("Arun",35,9112563439l);
        e1.setValue();
        e2.setValue();
        e3.setValue();
        e4.setValue();
    }
}
