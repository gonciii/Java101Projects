package week1;

//  Area of a sector of a circle = (𝜋 * (r*r) * 𝛼) / 360


import java.util.Scanner;
public class Area_Circular_Sector {
    public static void main(String[] args) {
        // Area of a sector of a circle of radius r,
        // with angle of angle :
        int r,angle;

        // constants pi :
        double pi = 3.14;

        // scanner class:
        Scanner input = new Scanner(System.in);

        // input :
        System.out.println("Enter the radius of the circle : ");
        r = input.nextInt();
        System.out.println("Enter the angle of the circle : ");
        angle = input.nextInt();

        // check for valid input :

        if (r <= 0 || angle < 0 || angle > 360) {
            System.out.println("Invalid input. Please enter positive radius and angle between 0 and 360.");
            return ;
        }


        // formula :  (𝜋 * (r*r) * 𝛼) / 360
        double area = (pi * (r * r) * angle) / 360;


        // output :
        System.out.print("The area of sector of a circle : " + area);


    }
}
