package week1;

// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
import java.util.Scanner;

public class OddNumberDivided4 {
    public static void main(String[] args) {
        // variables:
        int n, total = 0;
        // scanner class
        Scanner scan = new Scanner(System.in);
        // NOTE:
        System.out.println("---REMINDING : If you want to exit the program, you can enter 0.");
        // while and if :
        while (true) {
            System.out.print("Enter the number: ");
            n = scan.nextInt();

            System.out.println();
            if (n ==0) {
                break;
            }
            if (n%2==0 && n%4==0) {
                total += n;
            } else {
                System.out.println("The number you entered is even and not a multiple of 4. Please try again.");
            }
        }
        // output :
        System.out.println("Total: " + total);
    }
}

