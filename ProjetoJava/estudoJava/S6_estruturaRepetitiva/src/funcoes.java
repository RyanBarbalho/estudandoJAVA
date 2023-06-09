import java.util.Scanner;

public class funcoes {
    public static void main(String[] args ){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("digitar 3 numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
        
    }

    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        }
        else if ( y > z){
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;
    }

    private static void showResult(int value) {
        System.out.println("higher = "+ value);
    }
}
