package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities_enums.WorkerLevel;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data. ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary:  ");
        double baseSalary = sc.nextDouble();
        // instanciou novo objeto worker
        // foi instanciado um novo objeto do tipo Departamento
        // dois objetos, um do tipo worker e um do tipo departamento ligado a ele
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
                new Departament(departmentName));
        System.out.println("How many contracts? ");
        int n = sc.nextInt();
        // aqui serao instanciados os objetos de contrato pertencentes a cada
        // trabalhador
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());// pode dar excessao
            System.out.print("Value per hour: ");
            double valorPorHora = sc.nextDouble();
            System.out.println("Duration Hours: ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valorPorHora, hours);
            worker.addContract(contract);

        }
        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
