package week1;

// --------------Program that calculates class passing status----------------


import java.util.Scanner;
public class PassTheClass {
    public static void main(String[] args) {
        // variables:
        double math,physical,turkish,chemistry,music;

        // scanner class :
        Scanner input =new Scanner(System.in);

        System.out.print("Mathematics score : ");
        math = input.nextDouble();
        if (math < 0 || math > 100) {
            System.out.println("Mathematics score is invalid. Please enter a score between 0 and 100.");
            return;
        }

        System.out.print("Physical score: ");
        physical = input.nextDouble();
        if (physical < 0 || physical > 100) {
            System.out.println("Physical score is invalid. Please enter a score between 0 and 100.");
            return;
        }

        System.out.print("Turkish score: ");
        turkish = input.nextDouble();
        if (turkish < 0 || turkish > 100) {
            System.out.println("Turkish score is invalid. Please enter a score between 0 and 100.");
            return;
        }

        System.out.print("Chemistry score: ");
        chemistry = input.nextDouble();
        if (chemistry < 0 || chemistry > 100) {
            System.out.println("Chemistry score is invalid. Please enter a score between 0 and 100.");
            return;
        }

        System.out.print("Music score: ");
        music = input.nextDouble();
        if (music < 0 || music > 100) {
            System.out.println("Music score is invalid. Please enter a score between 0 and 100.");
            return;
        }

        // average and passing score :
        double average = (math+physical+turkish+chemistry+music) / 5;
        int passingScore=55;
        // output:
        if (average >= passingScore) {
            System.out.println("You passed the class,Congratulations!");
        } else {
            System.out.println("You failed the class,See you next year!");
        }

        System.out.println("SCORE: "+average);
    }
}
