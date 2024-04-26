package week1;


import java.util.Scanner;

// ~~~~~~~~ SUM OF DIGITS CALCULATOR~~~~~~~~~~~~~~~~

public class SumOfDigitsCalculate {
    public static void main(String[] args) {
        // scanner class :
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
       // variable definition
       int number = scan.nextInt();
       int total = 0;
       int numberCount = 0;
       int tempNum = number;    // we created temporary number to keep original number

        // number of digits and sum of digits contol while loop
       while (tempNum != 0) {
           total += tempNum % 10;
           tempNum /= 10;
           numberCount++;
       }
       // output
       System.out.println("Number of digits : " +numberCount);
       System.out.println("Sum of digits : " +total);

    }
}
