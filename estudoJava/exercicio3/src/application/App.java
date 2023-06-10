package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class App {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("\nName: ");
        String name = sc.nextLine();
        System.out.print("\nEmail: ");
        String email = sc.nextLine();
        System.out.print("\nBirth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());
        Client client = new Client(name, email, birthDate);

        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(new Date(), status, client);

        System.out.println("\nHow many items to this order? ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("\nEnter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String itemName = sc.nextLine();
            System.out.print("\nProduct price: ");
            double itemPrice = sc.nextDouble();
            System.out.print("\nQuantity: ");
            int itemQuantity = sc.nextInt();
            // produto <<---- pedido
            Product product = new Product(itemName, itemPrice);
            OrderItem orderItem = new OrderItem(itemQuantity, itemPrice, product);
            order.addItem(orderItem);
        }

        System.out.println(order);
        sc.close();
    }

}
