package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class programa {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
         

        System.out.println("Enter product data: ");
        System.out.println("name: ");
        String name = sc.nextLine();
        System.out.println("price: ");
        double price = sc.nextDouble();
        System.out.println("quantity in stock: ");
        int quantity = sc.nextInt();
        //o "produtos é um objeto de referencia"
        Product produtos = new Product(name, price, quantity);
        //o getter e setter serve para alterar os valores privados
        produtos.setName("TV");
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
