package week1;



import java.util.Scanner;

public class Arithmetic_Operation {
    public static void main(String[] args) {
        // değişkenler
        int a,b,c;

        // scanner sınıfı
        Scanner input = new Scanner(System.in);

        // kullanıcıdan veri alma :
        System.out.println("lütfen a sayısını giriniz :");
        a = input.nextInt();

        System.out.println("lütfen b sayısını giriniz: ");
        b = input.nextInt();

        System.out.println("Lütfen c sayısını giriniz: ");
        c = input.nextInt();

        // aritmetik işlem :
        double islem = a+b*c-b;

        // ekrana yazdırma  :
        System.out.println(" a+b*c-b işlemi'nin sonucu =  " + islem);
    }
}

