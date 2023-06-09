package Application;
import java.util.Locale;
import java.util.Scanner;
import Entities.products;

public class vectorsPart2 {
    public static void main(String[] args) {
        int n;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        //criar VETOR de objetos de referencia
        products[] vect = new products[n];

        for(int i = 0; i < vect.length ; i++){
            //sempre consumir a quebra de linha antes se tiver um scan antes do string
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            //instanciar novo produto
            vect[i] = new products(name, price);
        }

        double sum =0.0;
        for (int i=0; i<vect.length; i++){
            sum+= vect[i].getPrice();
        }
        System.out.println("AVERAGE PRICE = " + String.format("%.2f", sum/n));

        sc.close();
    }
}
