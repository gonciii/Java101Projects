package week1;

//---------CALCULATOR--------------
// calculator with the condition ıf-else

import java.util.Scanner;

public class Calculator_IfElse {
    public static void main(String[] args) {
        // variables :
        int number1, number2, whichOne;

        // Scanner class
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Please enter the number 1: ");
        number1 = input.nextInt();
        System.out.print("Please enter the number 2: ");
        number2 = input.nextInt();

        // step choose:
        System.out.println("1-summation\n2-subtraction\n3-division\n4-multiplication");
        System.out.print("Choose : ");
        whichOne = input.nextInt();

        System.out.println(whichOne);
        if (whichOne == 1) {
            System.out.println("Summation : " + number1 + " + " + number2 + " = " + (number1 + number2));
        } else if (whichOne == 2) {
            System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + (number1 - number2));
        } else if (whichOne == 3) {
            if (number2 != 0) {
                System.out.println("Division: " + number1 + " / " + number2 + " = " + (number1 / number2));
            } else {
                System.out.println("Division by zero error !");
            }
        } else if (whichOne == 4) {
            System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + (number1 * number2));
        } else {
            System.out.println("ERROR,please try again !");
        }

    }
}
