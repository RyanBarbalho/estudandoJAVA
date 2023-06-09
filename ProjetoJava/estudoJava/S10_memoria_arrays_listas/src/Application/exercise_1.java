package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.student;

public class exercise_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        //array de objetos de referencia
        student[] students = new student[n];
        int age;
        String name;
        double height;

        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.println("nome: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Idade: ");
            age = sc.nextInt();
            System.out.println("Altura: ");
            height = sc.nextDouble();

            students[i] = new student(name, age, height);
        }

        double average = 0;
        int count = 0;

        for(int i=0; i<n ; i++){
            average = average + students[i].getHeight();

            if(students[i].getAge() < 16){
                students[i].mark = 1;
                count++;
            }
        }
        int x = count;
        average = average/n;
        System.out.println("Altura media: " + String.format("%.2f", average));

        double percentage = count*100/n;

        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", percentage );
        for(int i=0; i<n ; i++){
            students[i].printMarked();
        }




        sc.close();
    }
}
