package week1;

//  Type Casting in Java

import java.util.Scanner;

// Casting Practice
public class CastingPractice {
    public static void main(String[] args) {
        // scanner class :
        Scanner input = new Scanner(System.in);

        // int number
        System.out.print("Enter an integer number : ");
        int intNum = input.nextInt();
        // double number
        System.out.print("Enter a double number : ");
        double doubleNum2 = input.nextDouble();

        //  converting int to double :
        double dNum = (double) intNum;
        System.out.println("Integer converted to double : " + dNum);

        // converting double to int :
        int intNum2 = (int) doubleNum2;
        System.out.print("Double converted to integer : " + intNum2);

    }
}
