package Application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        //criar matriz
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++){
            for( int j = 0; j < matriz.length; j++){
                matriz[i][j] = sc.nextInt();
                if(matriz[i][j] < 0) count++;
            }
        }
        System.out.println("---------------------");
        System.out.println("matriz:");
        for(int i = 0 ; i< matriz.length ; i++){
            for(int j=0 ; j < matriz.length ; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println("main diagonal");
        for (int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Negative numbers = " + count);
        System.out.println();



        sc.close();
    }
}
