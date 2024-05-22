package week5.ExceptionHandling.tryCatchPractice;

// exceptions practice

import java.util.Scanner;

public class TryCatchArray  {

    public static void index(int index) throws ArrayIndexOutOfBoundsException{
        // one dimensional array,10 elements
        String[] array ={"E","X","C","E","P","T","I","O","N","S"};
       if(index >= array.length) {
           // throw exception
           throw new ArrayIndexOutOfBoundsException();
       }

        System.out.println(index+"." + "index elemanı => "+array[index]);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi elemanı için index giriniz : ");
        int index = scanner.nextInt();


        try (scanner) {
            index(index);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Exception : " + a);          // catch exception

        }finally {
            scanner.close();
        }

    }
}
