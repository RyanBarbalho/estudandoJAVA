package Application;

import java.util.Locale;
import java.util.Scanner;

public class MATRIZ_EXERCISE {
    public static void main(String[] args) {
        int n, m;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //m = linha/// n = coluna
        m = sc.nextInt();
        n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matriz[i][j] == x){
                    position(matriz, i, j, m);
                }
            }
        }

        sc.close();
    }
    public static void position(int[][] arr, int i, int j,int m) {
        System.out.println("Position " + i +"," + j + ":");
        if(j>0){
            System.out.println("Left: " + arr[i][j-1]);
        }
        if(j < arr[i].length-1){
            System.out.println("Right: " + arr[i][j+1]);
        }
        if(i > 0){
            System.out.println("Up: " + arr[i-1][j]);
        }
        if(i < arr.length - 1){
            System.out.println("Down: " + arr[i+1][j]);
        }
        
    }
    
}
