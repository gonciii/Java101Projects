package week1;

// Exponential Numbers Calculator :

import java.util.Scanner;
public class ExponentialNumbers {
    public static void main(String[] args) {
        int base,power,result=1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base number : ");
        base = scan.nextInt();
        System.out.print("Enter the number of forces : ");
        power = scan.nextInt();

        for (int i=1; i<=power; i++) {
            result *= base;
        }
        System.out.print(base+"^"+power+"="+result);

    }
}
