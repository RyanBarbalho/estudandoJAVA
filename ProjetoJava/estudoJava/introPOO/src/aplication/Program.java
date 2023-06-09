package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program{
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();
        double areay = y.area();
        System.out.printf("area x = %.2f\n", areax);
        System.out.printf("area x = %.2f\n", areay);


        if(areax > areay){
            System.out.printf("a area x: %.2f\n", areax);
        }
        else System.out.printf("area y: %.2f\n", areay);


        
        sc.close();
    }
}
