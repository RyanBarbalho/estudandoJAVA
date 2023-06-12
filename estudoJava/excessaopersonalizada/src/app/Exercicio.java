package app;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Exercicio {
    // main
    public static void main(String[] args) {
        // set locale us
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        System.out.println();
        Account acc = new Account(number, holder, balance, withdrawLimit);
        System.out.println("Enter amount for withdraw: ");
        double amount = sc.nextDouble();
        try {
            // IllegalArgumentException pode ser lançada por esse argumento
            acc.withdraw(amount);
            System.out.println();
            System.out.println("New balance: " + acc.getBalance());
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
