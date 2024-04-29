package week2;

//  Exponential Numbers Calculator

import java.util.Scanner;

public class ExponentialNumbers {
    // recursive method for exponentiation
    static int exponential(int base, int power) {
        // if power is 0, any number raised to power 0 is 1.
        if (power == 0) {
            return 1;
        } else {
            // if power is not 0, recursively call the function to calculate base^power :
            return base * exponential(base, power - 1);
        }
    }
    public static void main(String[] args) {
        // scanner class and input :
        Scanner scan = new Scanner(System.in);
        System.out.print("Base : ");
        int base = scan.nextInt();
        int power;

        do {
            System.out.print("Power (non-negative) : ");
            power = scan.nextInt();
            if (power < 0) {
                System.out.println("Error: Please enter a non-negative power ! ");
            }
        } while (power < 0);

        // Calculate exponentiation based on given base and power values
        int result = exponential(base, power);
        System.out.println("Result : " + base + "^" + power + " = " + result);
    }
}
