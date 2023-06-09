package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.rent;

public class pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        rent[] renter = new rent[10];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        String name, email;
        int room;

        for(int i=0; i<n; i++){
            System.out.println("Rent #"+(i+1)+":");
            System.out.println("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Email: ");
            email = sc.nextLine();
            System.out.println("Room: ");
            room = sc.nextInt();

            renter[room] = new rent(name, email);
        }
        
        System.out.println("Busy rooms: ");
        for ( int i=0 ; i<10 ; i++)
        {
            if(renter[i] != null){
                System.out.println( i+": "+ renter[i]);
            }
        }



        sc.close();
    }
}
