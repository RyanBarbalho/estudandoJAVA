package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exception.DomainException;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            sc.nextLine();
            Date checkIn = sdf.parse(sc.nextLine());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.nextLine());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.nextLine());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.nextLine());
            // IllegalArgumentException pode ser lançada por esse argumento
            reservation.updateDays(checkIn, checkOut);

            System.out.println(reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
