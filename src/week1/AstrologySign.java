package week1;

// --- ASTROLOGY PROGRAMMING-----

import java.util.Scanner;
public class AstrologySign {
    public static void main(String[] args) {
        // variables:
        int month,day;

        // input :
        Scanner input = new Scanner(System.in);
        System.out.print("Your birth month : ");
        month = input.nextInt();
        System.out.print("Your birth day :");
        day = input.nextInt();

        // if-else :
        if ((month==3 && day>=21) || (month==4 && day<=20)){
            System.out.println("Your zodiac sign : Aries");
        } else if ((month==4 && day>=21) || (month==5 && day<=21)) {
            System.out.println("Your zodiac sign : Taurus");
        } else if ((month==5 && day>=22) || (month==6 && day<=22)) {
            System.out.println("Your zodiac sign : Gemini");
        } else if ((month==6 && day>=23) || (month==7 && day<=22)) {
            System.out.println("Your zodiac sign : Cancer");
        } else if ((month==7 && day>=23) || (month==8 && day<=22)) {
            System.out.println("Your zodiac sign : Leo");
        } else if ((month==8 && day>=23) || (month==9 && day<=22)) {
            System.out.println("Your zodiac sign : Virgo");
        } else if ((month==9 && day>=23) || (month==10 && day<=22)) {
            System.out.println("Your zodiac sign : Libra");
        } else if ((month==10 && day>=23) || (month==11 && day<=21)) {
            System.out.println("Your zodiac sign : Scorpio");
        } else if ((month==11 && day>=22) || (month==12 && day<=21)) {
            System.out.println("Your zodiac sign : Sagittarius");
        } else if ((month==12 && day>=22) || (month==1 && day<=21)) {
            System.out.println("Your zodiac sign : Capricorn");
        } else if ((month==1 && day>=22) || (month==2 && day<=19)) {
            System.out.println("Your zodiac sign : Aquarius");
        } else if ((month==2 && day>=22) || (month==3 && day<=20)) {
            System.out.println("Your zodiac sign : Pisces");
        } else {
            System.out.println("Invalid date!");
        }

    }
}
