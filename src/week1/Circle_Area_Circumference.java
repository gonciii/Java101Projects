package week1;

//Write a program in Java that calculates the area and perimeter of a circle whose radius you receive from the user.

import java.util.Scanner;
public class Circle_Area_Circumference {
    public static void main(String[] args) {
        // variables :
        int r;
        double pi = 3.14;

        // scanner class :
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle:");

        // radius
        r = input.nextInt();
        //Area Formula: π * r * r;
        double area = pi * r * r;
        // Circumference Formula : 2 * π * r;
        double circumference = 2 * pi * r;


        // let's print it on the screen :

        System.out.println("Area of the circle : " + area);
        System.out.println("Circumference of the circle : " + circumference);

    }
}
