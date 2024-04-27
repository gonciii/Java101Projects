package week1;

//     DIAMOND with stars
/*  Expected output  if n=4 ;

                *
               ***
              *****
             *******
              *****
               ***
                *

 */

import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        // scann class:
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        // input:
        int n = scan.nextInt();

        // 1.step: 1 to n
        for (int i = 1; i <= n; i++) {
            // for space : (n-i)
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            // for stars :
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // to get to the bottom line !
            System.out.println();
        }
        // 2.step :  (n-1) to 1
        for (int i = n-1;  i >= 1;  i--) {
            // for space : (n-i)
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            // for stars :
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }


            // to get to the bottom line !
            System.out.println();
        }
    }
}
