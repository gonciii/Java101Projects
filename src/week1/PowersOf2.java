package week1;


//Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

import java.util.Scanner;
public class PowersOf2 {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        n= scan.nextInt();

        for (int i=1; i<=n; i*=2) {
            System.out.println(i);
        }
    }
}
