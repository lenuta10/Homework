package homework3.model;

public class Employee extends Person {

    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "The employee " + super.toString() + " and has a salary of " + salary + " lei";
    }
}
