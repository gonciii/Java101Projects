package week1;

// Combination Calculation

import java.util.Scanner;
public class CombinationCalculation {
    public static void main(String[] args) {
        int n,r;
        // long data type for large number operations
        long total1=1,total2=1,total3=1;

        Scanner scan = new Scanner(System.in);
        System.out.print("n :");
        n = scan.nextInt();
        System.out.print("r: ");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            total1 *= i;
        }
        for (int j=1; j <=r; j++) {
            total2 *= j;
        }
        for (int k=1; k<=n-r; k++) {
            total3 *= k;
        }
        // combination calculator formula : C(n,r) = n! / (r! * (n-r)!)

        long formula = (total1 / (total2*total3));

        // output :
        System.out.print("C(n,r) = " +formula);
    }
}
