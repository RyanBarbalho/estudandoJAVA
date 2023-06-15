package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import model.comparables.Employee;

public class ExerciseComparable {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(3000.00, "Maria"));
        list.add(new Employee(5000.00, "Alex"));
        list.add(new Employee(4000.00, "Marco"));

        Collections.sort(list);
        for (Employee emp : list) {
            System.out.println(emp.getName() + ", " + emp.getSalary());
        }
    }
}
