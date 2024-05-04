package week2;


import java.util.Arrays;
import java.util.Random;

public class ArraysHarmonic {
    public static void main(String[] args) {
        // created an array with 5 elements
        int[] array = new int[3];
        // random class :
        Random rnd = new Random();
        // add elements into the array:
        for (int i=0; i<array.length; i++) {
            array[i] = rnd.nextInt(20);
        }
        System.out.println("Arrays  = > " + Arrays.toString(array));

        // harmonic average :
        double result =0;
        for (int i=0; i<array.length; i++) {
            result += 1.0 / array[i] ;
        }
        // array.length = n
        double harmonicAverage = array.length + result ;
        System.out.print("Harmonic Average : " + harmonicAverage);

    }
}