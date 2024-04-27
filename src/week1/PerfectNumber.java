package week1;

// -----PERFECT NUMBER CALCULATOR------------
//   28 perfect number.
//   1 is not perfect number.

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // scanner class
        Scanner scan = new Scanner(System.in);
        // input
        System.out.print("Please enter the number : ");
        // variable definition
        int number = scan.nextInt();

        // loop checking if it is a perfect number :
        int summation= 0;
        for (int i=1; i<number; i++) {
            if (number % i == 0) {
                // Common divisor numbers are added to the summation variable.
                summation += i;
            }
        }
        // output :
        if (summation != number) {
            System.out.println("It's not a perfect number !");
        } else {
            System.out.println("It's a perfect number ! ");
        }
    }
}
