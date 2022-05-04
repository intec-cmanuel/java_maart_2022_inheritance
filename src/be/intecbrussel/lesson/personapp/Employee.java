package be.intecbrussel.lesson.personapp;

public class Employee extends Person {
    private String employeeID;
    private double salary;
    private String manager;

    public Employee(String employeeID, double salary, String manager) {
        this.employeeID = employeeID;
        this.salary = salary;
        this.manager = manager;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public void presentYourself() {
        System.out.printf("Hello, I am %s. I work at this store.%n", super.getName());
    }
}
