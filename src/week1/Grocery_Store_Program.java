package week1;


/*
--------- Fruits and KG prices ------------
Pear : 2,14 TL
Apple : 3,67 TL
Tomato : 1,11 TL
Banana: 0,95 TL
Eggplant : 5,00 TL

 */

import java.util.Scanner;
public class Grocery_Store_Program {
    public static void main(String[] args) {

        // create values :
        double p,a,t,b,e;

        // defined Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt user to input quantities :
        System.out.print("How many Kilos of pear ? : ");
        p = input.nextDouble();

        System.out.print("How many Kilos of apple ? :");
        a = input.nextDouble();

        System.out.print("How many Kilos of tomato ? :");
        t = input.nextDouble();

        System.out.print("How many Kilos of banana ? :");
        b = input.nextDouble();

        System.out.print("How many Kilos of eggplant ? :");
        e = input.nextDouble();


        // Calculate total amount

        double totalAmount = (p * 2.14) + (a * 3.67) + (t * 1.11) + (b * 0.95) + (e * 5.00);


        // Let's print the result :

        System.out.print("Total amount :  " + totalAmount+" "+ "TL");


    }
}
