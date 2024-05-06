package week2;

// Write a program that finds the closest number to the smallest number and the closest number to the largest number of the elements in the array.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        // scanner obeject
        Scanner scan = new Scanner(System.in);
        // random object
        Random rnd = new Random();

        // array element from the user
        System.out.print("Enter the number of elements for the array: : ");
        int size = scan.nextInt();
        // target number from user
        System.out.print("Enter target number : ");
        int target = scan.nextInt();

        // created array
        int[] array = new int[size];

        // integer random number
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(100);
        }

        // sort from smallest to largest
        Arrays.sort(array);
        // array print with Array.toString
        System.out.println("Array : " +Arrays.toString(array));

        int min = array[0];
        int max = array[0];
        // min number
        for (int i =0; i<array.length; i++) {
            if (min > array[i] ) {
                min = array[i];
            }
        }
        //  max number
        for (int i=0; i<array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        // detection of proximity to a large number
        for (int index : array)  {
            if ( index > target ) {
                if ( index <= max) {
                    max = index;
                }
            }
        }
        // detection of proximity to small number
        for (int index : array) {
            if( index < target) {
                if ( index >= min) {
                    min = index;
                }
            }
        }
        // output :
        System.out.println("Nearest number less than the entered number  : " + min);
        System.out.println("Nearest number greater than the entered number : " + max);




    }
}
