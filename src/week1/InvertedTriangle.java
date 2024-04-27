package week1;

// Inverted Triangle with stars

import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        // scanner class and input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of digits : ");
        int digit = scan.nextInt();

        // loop for each row
        for (int i = 1; i <= digit; i++) {
            // loop for printing stars
            for (int j = i; j <= digit; j++) {
                System.out.print("*");
            }
            // move to the next line
            System.out.println();
        }
    }
}

