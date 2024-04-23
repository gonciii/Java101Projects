package week1;

// ---------Taximeter Programming------

import java.util.Scanner;

public class Taximeter_Programming {
    public static void main(String[] args) {
        // variables:
        int km;

        //Taximeter costs 2.20 TL per KM.
        //Taximeter opening fee is 10 TL.
        double perKm = 2.20, total,startPrice = 10;

        // Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the distance in km : ");
        km = input.nextInt();

        total = (km*perKm);
        total += startPrice;

        // The minimum payable amount is 20 TL. For fares under 20 TL, 20 TL will still be charged.
        // with ternary operator :

        total = (total < 20 ) ? 20 : total;
        System.out.println("Total amount : " + total +" "+"TL");

    }
}
