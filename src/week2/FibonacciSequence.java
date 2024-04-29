package week2;
// Fibonacci Sequence


import java.util.Scanner;
public class FibonacciSequence {
    static int fibonacci(int n) {
        // since we know the value of 1 and 2 :
        if (n==1 || n==2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which Fibonacci number do you want to calculate => ");
        int n = scan.nextInt();

        if (n < 1) {
            System.out.println("Invalid number !");
        } else {
            int result = fibonacci(n);
            System.out.println(result);
        }

    }
}
