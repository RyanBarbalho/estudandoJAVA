package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.product; 

public class programa {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        product produtos = new product();
        System.out.println("Enter product data: ");
        System.out.println("name: ");
        produtos.name = sc.nextLine();
        System.out.println("price: ");
        produtos.price = sc.nextDouble();
        System.out.println("quantity in stock: ");
        produtos.quantity = sc.nextInt();

        System.out.println(produtos.toString());
        
        System.out.println("Enter number of products to be added in stock: ");
        int newQuantity = sc.nextInt();
        produtos.addProducts(newQuantity);

        System.out.println(produtos.toString());

        System.out.println("Enter number of products to be removed from stock: ");
        newQuantity = sc.nextInt();
        produtos.removeProducts(newQuantity);

        System.out.println(produtos.toString());

        sc.close();
    }
}
