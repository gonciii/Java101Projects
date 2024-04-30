package week2;

//  According to arithmetic pattern with recursive func.

import java.util.Scanner;

public class RecursivePattern {
    static void recursiveMethod(int number) {
        // print the current number
        System.out.print(number + " ");
        // If the number is greater than 0, continue the recursive process
        if ( number > 0) {
            // Call the recursiveMethod with number - 5
            recursiveMethod(number-5);
            // Print the current number again after the recursive call
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        // scanner object
        Scanner scan = new Scanner(System.in);
        // input
        System.out.print("Number :");
        int number = scan.nextInt();

        recursiveMethod(number);
    }
}