package week1;

// We are writing a program to find Fibonacci series using Java loops. Get the number of elements of the Fibonacci series from the user.

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        // input
        Scanner input = new Scanner(System.in);
        System.out.print("n : ");
        int n = input.nextInt();

        // default variables 0,1
        int f1 = 0;   // fibonacci 1
        int f2 = 1;   // fibonacci 2

        System.out.print("Fibonacci Sequence :  ");
        System.out.print(f1 + " " + f2 + " ");
        // Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
        for (int i = 2; i < n; i++) {
            int next = f1 + f2;
            System.out.print(next + " ");
            f1 = f2;
            f2 = next;

        }

    }
}
