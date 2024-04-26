package week1;

// Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

import java.util.Scanner;
public class DivisibleBy3And4 {
    public static void main(String[] args) {
        // variables :
        int n ;
        double sum=0,count=0;
        // scanner class
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = scan.nextInt();

        // Numbers divisible by 3 and 4
        for (int i=0; i<n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i +"," + "\n");  //Numbers divisible by 3 and 4
                sum +=i;
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("The number you entered does not contain numbers that can be divided by 3 and 4.");
        } else {
            double average = sum / count;
            System.out.print("Average: " + average);
        }


    }
}
