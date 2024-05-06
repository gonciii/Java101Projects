package week2;

import java.util.Arrays;

public class ElementFrequencyArray {
    public static void main(String[] args) {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20}; // Creating an array and initializing it with values

        Arrays.sort(array); // Sorting the array in ascending order

        System.out.println("Array : " + Arrays.toString(array)); // Printing the sorted array

        // Calculate and print the frequencies
        System.out.println("-------------");
        int count = 1;                           // Initializing a counter
        for (int i = 1; i < array.length; i++) { // Looping through the array elements
            if (array[i] == array[i - 1]) {      // Checking if the current element is equal to the previous one
                count++;                         // Incrementing the counter if they are equal
            } else { // If not equal
                System.out.println(array[i - 1] + " repeated " + count + " times."); // Printing the frequency of the previous element
                count = 1; // Resetting the counter
            }
        }
        // Print the frequency of the last element
        System.out.println(array[array.length - 1] + " repeated " + count + " times."); // Printing the frequency of the last element
    }
}

