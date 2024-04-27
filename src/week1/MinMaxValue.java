package week1;

// ------------ MIN AND MAX VALUE CALCULATOR --------------

import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        // scanner class :
        Scanner input = new Scanner(System.in);
        // input : how many numbers ?
        System.out.print("How many numbers will you enter ? : ");
        int number = input.nextInt();

        // number = 0 :
        if ( number <= 0) {
            System.out.println("Warning : Invalid number ! ");
            return;
        }
        // input
        System.out.println("Please enter " +number+ " numbers: " );

        // to make comparison :
        int minN = input.nextInt();
        int maxN = minN;
        // min and max value:
        int i  = 1;
        while (i < number) {
            int num = input.nextInt(); //  temporary!
            if (num < minN) {
                minN = num;
            }
            if (num > maxN) {
                maxN = num;
            }
            // counter :
            i++;

        }
        // output :
        System.out.println("Min : " + minN);
        System.out.println("Max : " + maxN);
    }
}

