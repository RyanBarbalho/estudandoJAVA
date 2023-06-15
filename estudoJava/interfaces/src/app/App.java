package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String model = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), frmt);// 23/06/2018 10:30
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime end = LocalDateTime.parse(sc.nextLine(), frmt);// 25/06/2018 11:40

        CarRental cr = new CarRental(start, end, new Vehicle(model));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("INVOICE:");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().totalPayment()));

    }
}
