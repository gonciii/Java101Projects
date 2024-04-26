package week1;

// GİRİLEN SAYIYA KADAR OLAN ÇİFT SAYILARI BULAN PROGRAM


import java.util.Scanner;
public class EvenNumberLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Enter the number : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }

}
