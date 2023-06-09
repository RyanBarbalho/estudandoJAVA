package Entities;

public class employee {
    private Integer id;
    private String name;
    private Double salary;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

    public double increaseSalary(double percentage){
        return salary *= (1+(percentage/100));

    }


    
}
