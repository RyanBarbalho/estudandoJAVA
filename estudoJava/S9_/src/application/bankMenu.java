package application;

import java.util.Locale;
import java.util.Scanner;

import entities.bank;

public class bankMenu {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number;
        String name;
        double balance;
        //criar objeto de referencia
        bank bankAccount;
        
        System.out.println("Enter account number:");
        number = sc.nextInt();
        name = sc.nextLine();
        System.out.println("Enter account holder name:");       
        name = sc.nextLine();
        
        System.out.println("do you wish to do an initial deposit?(Y/N):");
        char x = sc.next().charAt(0);
        x = Character.toUpperCase(x);

        if(x == 'Y'){
            System.out.println("Enter inital deposit value:");
            balance = sc.nextDouble();
            bankAccount = new bank(number, name, balance);
        }
        else bankAccount = new bank(number, name);

        System.out.println(bankAccount.toString());
        
        System.out.println("Enter a deposit value:");
        balance = sc.nextDouble();
        bankAccount.deposit(balance);
        System.out.println(bankAccount.toString_());

        System.out.println("Enter a whitdraw value:");
        balance = sc.nextDouble();
        bankAccount.withDraw(balance);
        System.out.println(bankAccount.toString_());


        sc.close();
    }
    
}
