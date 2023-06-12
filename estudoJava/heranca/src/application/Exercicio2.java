package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Exercicio2 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (ch == 'c') {
                Product prod = new Product(name, price);
                list.add(prod);
            } else if (ch == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                Product prod = new UsedProduct(name, price, date);
                list.add(prod);
            } else if (ch == 'i') {
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product prod = new ImportedProduct(name, price, customsFee);
                list.add(prod);
            }
        }
        System.out.println("PRICE TAGS: ");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
        sc.close();
    }

}
