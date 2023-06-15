package model.comparables;

public class Employee implements Comparable<Employee> {
    private double salary;
    private String name;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}
