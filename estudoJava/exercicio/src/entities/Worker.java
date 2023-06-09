package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities_enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartment() {
        return department;
    }

    public void setDepartment(Departament department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    // desfazer ou fazer a associacao do contrato é remover da lista
    public void addContract(HourContract contract) {
        // add contract to list
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            // extrair os valores inteiros das datas do ano do contrato
            cal.setTime(c.getDate());
            int contractYear = cal.get(Calendar.YEAR);
            // acrescenta 1 pois o mes do Calendar começa com zero
            int contractMonth = cal.get(Calendar.MONTH);
            contractMonth += 1;

            if (year == contractYear && month == contractMonth) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

}
