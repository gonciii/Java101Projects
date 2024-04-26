package week1;


//----------HARMONIC SERIES---------------


import java.util.Scanner;
public class HarmonicSeriies {
    public static void main(String[] args) {
        // scann class
        Scanner scan = new Scanner(System.in);
        // input:
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        // double/ double = double
        double result = 0;

        // 1+1/2+1/3+......
        for (double i=1; i<=n; i++){
            result += 1 / i;
        }
        // output :
         System.out.print("Harmonic series result : " + result);


    }
}
