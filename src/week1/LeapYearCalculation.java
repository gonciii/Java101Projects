package week1;

// ------- LEAP YEAR CALCULATION--------
// A leap year is a year with 366 days instead of 365 in the Gregorian calendar. This extra day (leap day) is obtained by adding February 29 to February, which normally has 28 days.

import java.util.Scanner;
public class LeapYearCalculation {
    public static void main(String[] args) {
        int year; // variables

        // input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year : ");
        year = scanner.nextInt();

        // ıf-else and output
        if ((year%4==0 && year%100 !=0) || (year%400==0)) {
            System.out.println("It is a leap year !");
        }else {
            System.out.println("Its not leap year !");
        }
    }
}
