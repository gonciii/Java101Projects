package week2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // random obeject and scanner object
        Random rnd = new Random();
        int randomNum = rnd.nextInt(100);
        Scanner scanner = new Scanner(System.in);


        int right =0;
        int[] wrongSelected = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(" -----Welcome to the number guessing game !-----");

        while (right < 5) {
            System.out.print("Enter a number guess : ");
            int selected = scanner.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Warning ! Please enter a number 0-100 !!");
                if ( isWrong) {
                    right++;
                    System.out.println("You have made too many incorrect entries.Your remaining right : " + (5-right));
                    System.out.println("If you enter incorrectly again, your credit will be deducted.");
                } else {
                    isWrong = true;
                    System.out.println("If you enter incorrectly again, your credit will be deducted.");
                }
                continue;
            }
            if (selected == randomNum) {
                System.out.println(" Congratulations !  Correct answer, the number you guessed : " + randomNum);
                isWin = true;
                break;
            } else {

                System.out.println("Wrong guess !");
                if (selected > randomNum) {
                    System.out.println("The number " + selected + " is greater than the secret number");
                } else {
                    System.out.println("The number " + selected + " is less than the secret number");
                }
                wrongSelected[right++ ]= selected;
                System.out.println("Right : " + (5 - right));
            }

        }
       if ( ! isWin ) {
           System.out.println("Game Over !");
           System.out.println("The secret number was : " + randomNum); {
               if ( ! isWrong) {
                   System.out.println("Guess Numbers : " + Arrays.toString(wrongSelected));
               }
           }
       }

    }

}


