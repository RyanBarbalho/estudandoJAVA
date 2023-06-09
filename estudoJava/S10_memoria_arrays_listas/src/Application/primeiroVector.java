package Application;

import java.util.Locale;
import java.util.Scanner;

public class primeiroVector {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[] vector = new double[n];
        double averageH = 0;
        int i=0;

        while(i<3){
            vector[i] = sc.nextDouble();
            averageH += vector[i];
            i++;
        }
        System.out.println("AVERAGE HEIGHT = " + String.format("%.2f", averageH/n));


        sc.close();
    }
}
