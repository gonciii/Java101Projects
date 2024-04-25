package week1;

// Write a program in Java that takes the date of birth from the user and calculates the Chinese Zodiac value.

import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        // scanner class
        Scanner input = new Scanner(System.in);

        // variables
        int year;
        // input :
        System.out.println("Enter the birth year : ");
        year = input.nextInt();

        // IF-ELSE
        String chineseZodiac = "";
        if (year%12==0) {
            chineseZodiac = "MONKEY";
        } else if (year%12==1) {
            chineseZodiac = "ROOSTER";
        } else if (year%12==2) {
            chineseZodiac = "DOG";
        } else if (year%12==3) {
            chineseZodiac = "PIG";
        } else if (year%12==4) {
            chineseZodiac = "MOUSE";
        } else if (year%12==5) {
            chineseZodiac = "BULLOCK";
        } else if (year%12==6) {
            chineseZodiac = "TIGER";
        } else if (year%12==7) {
            chineseZodiac = "RABBIT";
        } else if (year%12==8) {
            chineseZodiac = "DRAGON";
        } else if (year%12==9) {
            chineseZodiac = "SNAKE";
        } else if (year%12==10) {
            chineseZodiac = "HORSE";
        } else if (year%12==11) {
            chineseZodiac = "SHEEP";
        }

        // Output the result
        System.out.println("Chinese Zodiac Sign for the birth year " + year + " is " + chineseZodiac);
    }
}
