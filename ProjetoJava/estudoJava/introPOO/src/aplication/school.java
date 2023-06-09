package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.grades;

public class school {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        grades student = new grades();

        student.name = sc.nextLine();
        student.A = sc.nextDouble();
        student.B = sc.nextDouble();
        student.C = sc.nextDouble();

        double grade = student.finalGrade();
        student.passed(grade);


        sc.close();
    }
    
}
