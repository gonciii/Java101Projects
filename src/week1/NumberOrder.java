package week1;

//  Write a program that sorts the 3 entered numbers "from smallest to largest".

import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
        // variables numbers :
        int x,y,z ;

        //scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("x : ");
        x = input.nextInt();
        System.out.print("y : ");
        y = input.nextInt();
        System.out.print("z : ");
        z= input.nextInt();

        // if - else
        if ((x<y) && (x<z)) {
            if (y<z) {
                System.out.println("x < y < z");
            } else {
                System.out.println("x < z < y");
            }

        } else if ((y < x) && (y < z)) {
            if (x < z){
                System.out.println("y < x < z");
            } else {
                System.out.println("y < z < x");
            }
        } else {
            if (x < y) {
                System.out.println("z < x < y");
            } else {
                System.out.println("z < y < x");
            }
        }


    }
}
