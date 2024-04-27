package week1;

//  Write a program in Java that prints prime numbers between 1 and 100 on the screen.

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("-----Prime Numbers-------");

        //outer loop i: Checks numbers between 2-100.
        for (int i = 2; i <= 100; i++) {
            int divisorCounter = 0;
            // inner loop j : Checks numbers 1-i.
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCounter++;
                }
            }
            if (divisorCounter == 2) {
                System.out.print(i + " ");
            }
        }

    }
}