package week2;

//

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EvenOddNumberArray {
    public static void main(String[] args) {
        // scanner object and rnadom object
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        // ask the user to enter the number of elemnts for the array
        System.out.print(" Enter the number of elements for the array : ");
        int size = input.nextInt();

        int[] array = new int[size];
       for (int i=0; i<array.length; i++) {
           // the array with random numbers
           array[i] = random.nextInt(30);
       }
        System.out.println(Arrays.toString(array));


      int evenNumber=0,oddNumber=0;
       for (int i: array) {
           if (i%2==0) {
               evenNumber ++ ;
           } else {
               oddNumber ++;
           }
       }
       // create arrays to store even and odd numbers
       int[] even= new int[evenNumber];
       int[] odd= new int[oddNumber];

       // seperate even and odd numbers
       int evenIndex = 0,oddIndex=0;
       for (int j: array) {
           if (j % 2==0) {
               even[evenIndex++] =j ;
           } else {
               odd[oddIndex++] = j;
           }
       }
        // Print even and odd numbers : output
        System.out.println("Even numbers: " + Arrays.toString(even));
        System.out.println("Odd numbers: " + Arrays.toString(odd));

    }
}
