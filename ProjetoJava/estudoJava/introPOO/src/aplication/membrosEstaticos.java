package aplication;

import java.text.Format;
import java.util.Locale;
import java.util.Scanner;

import util.calculator;

public class membrosEstaticos{
    //"variavel global que nao pode mudar (final)"
  

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        double dolarPrice = sc.nextDouble();
        double quantity = sc.nextDouble();

        double amount = calculator.currency(dolarPrice, quantity);
        System.out.printf("amount paid in reais = %.2f", amount);
        
        sc.close();
    }


    
}