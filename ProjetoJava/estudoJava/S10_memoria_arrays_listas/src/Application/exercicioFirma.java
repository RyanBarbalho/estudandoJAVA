package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entities.employee;

public class exercicioFirma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many employees wil be registered?");
        int n;
        n = sc.nextInt();
        
        List<employee> lista = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + ": ");
            System.out.println("Id: ");
            int id = sc.nextInt();
            while (idTaken(lista, id)) {
                System.out.println("id already taken.");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Salary: ");
            double salary = sc.nextDouble();
        
            //crio o objeto e insiro ele na lista
            employee emp = new employee(id, name, salary);
            lista.add(emp);
        }

        System.out.println("Enter the employee id that will have a salary increase: ");
        int findId = sc.nextInt();
        
        // transforma em stream // lamba operation
        // encontrar primeiro elemento que atenda a o predicado
        // a funçao retorna o node que vamos alterar
        employee empId = lista.stream().filter(x -> x.getId() == findId).findFirst().orElse(null);
        if (empId == null){
            System.out.println("non existent Id.");
        }
        else {
            System.out.println("Enter percentage: ");
            double percentage = sc.nextDouble();
            empId.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        // variavel i do tipo employee
        for (employee i : lista) {
            System.out.println(i);
        }

        sc.close();
    }

    public static boolean idTaken(List<employee> lista, int id) {
        employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        //se nao encontrou retorna false
        if(emp == null){
            return false; 
        }
        else return true;
    }


}
