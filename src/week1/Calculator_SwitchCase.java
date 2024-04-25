package week1;

// -----CALCULATOR With Switch-Case


import java.util.Scanner;
public class Calculator_SwitchCase {
    public static void main(String[] args) {
        // variables :
       int number1,number2,choose;

        // scanner class :
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Please enter the first number : ");
        number1 = input.nextInt();
        System.out.print("Please enter the second number : ");
        number2 = input.nextInt();

        // step : choose
        System.out.println("1-summation\n2-subtraction\n3-division\n4-multiplication");
        System.out.print("Choose : ");
        choose = input.nextInt();


        // switch-case
        switch (choose) {
            case 1:
                System.out.println("Summation : " + number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case 2:
                System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case 3:
                if (number2 != 0) {
                    System.out.println("Division: " + number1 + " / " + number2 + " = " + (number1 / number2));
                } else {
                    System.out.println("Error: Can not divide by zero!");
                }
                break;
            case 4:
                System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + (number1 * number2));
                break;

            default:
                System.out.println("Error,please try again !");
                break;

        }

    }
}
