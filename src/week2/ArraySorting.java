package week2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        // scanner object
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size for the array : ");
        int size = scan.nextInt();

        // created array
        int[] array = new int[size];
        for (int i=0; i<array.length; i++) {
            System.out.print((i+1) + "st element: ");
            array[i] = scan.nextInt();
        }
        // sorting
        Arrays.sort(array);
        // input
        System.out.println("Array(from small to large) = > " + Arrays.toString(array));


    }
}
