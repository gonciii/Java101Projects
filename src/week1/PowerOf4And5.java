package week1;

//  Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
import java.util.Scanner;
public class PowerOf4And5 {
    public static void main(String[] args) {
        // variables
        int number;
        // input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = scan.nextInt();

        System.out.println("---Powers of 4 and 5----");

        // default values
        int i=1,powerOf4=1,powerOf5=1;

        while (i<=number) {
            System.out.println("4^" + i + "=" + powerOf4);
            powerOf4 *= 4;
            System.out.println("5^" + i + "=" + powerOf5);
            powerOf5 *= 5;
            i++;
        }


    }
}
