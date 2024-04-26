package week1;

// Factorial Calculation

import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        // n! =1 * 2 * 3 *....*n
        int n, total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total *= i;

        }
        System.out.println(n+"!"+"=" + total);
    }
}
