package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        sc.nextLine();
        Date checkIn = sdf.parse(sc.nextLine());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.nextLine());
        System.out.println("Reservation: " + number + ", " + checkIn + ", " + checkOut);
        Reservation reservation = new Reservation(number, checkIn, checkOut);

        System.out.println("Enter data to update the reservation: ");
        System.out.println("Check-in date (dd/MM/yyyy): ");
        checkIn = sdf.parse(sc.nextLine());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        checkOut = sdf.parse(sc.nextLine());

        sc.close();
    }
}