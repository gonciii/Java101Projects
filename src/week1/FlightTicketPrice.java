package week1;

// -------------Flight Ticket Price Programming--------------------

import java.util.Scanner;

public class FlightTicketPrice {
    public static void main(String[] args) {
        // variables :
        int age, tripType;
        double km, totalPrice, kmPer = 0.10;

        //scanner class:
        Scanner input = new Scanner(System.in);

        // input :
        System.out.print("Km: ");
        km = input.nextDouble();
        System.out.print("Age: ");
        age = input.nextInt();
        System.out.print("Trip type ( 1 => for One-way, 2 => for Round trip): ");
        tripType = input.nextInt();

        totalPrice = km * kmPer;


        if ((km <= 0 || age <= 0) || (tripType != 1 && tripType != 2)) {
            System.out.println("You entered incorrect data ! ");
            return ; // exit the program

        }

        if (age < 12) {
            totalPrice -= (totalPrice * 0.50);  // %50 discount for age under 12
        } else if (age >= 12 && age <= 24) {
            totalPrice -= (totalPrice * 0.10);   // %10 discount for age between 12 and 24
        } else if (age >= 65) {
            totalPrice -= (totalPrice * 0.30);   // %30 discount for age 65 and over
        }


        if (tripType == 2) {
            totalPrice -= (totalPrice * 0.20);
            totalPrice = totalPrice * 2;
            // %20 discount for round trip
        }

        System.out.println("Total amount to be paid :  "+ totalPrice +" "+"TL");
    }
}
