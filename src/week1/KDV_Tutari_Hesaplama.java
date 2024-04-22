package week1;

// Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

import java.util.Scanner;
public class KDV_Tutari_Hesaplama {
    public static void main(String[] args) {
        // Değişken tanımlama aşaması : :
        double tutar,kdvOrani,kdvTutari,kdvliTutar;

        // Scanner sınıfını kullanarak kullanıcıdan tutar alalım :
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ürünün tutarını giriniz : ");
        tutar = input.nextDouble();

        // KDV oranını if koşulu ile belirleyelim :

        if (tutar > 0 && tutar < 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        // KDV tutarını ve KDV'li tutarı belirleyelim :
        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;


        // sonuçları ekrana yazdıralım :
        System.out.println("Ürünün fiyatı: " + tutar + " TL");
        System.out.println("Ürünün KDV oranı: %" + (kdvOrani * 100));
        System.out.println("Ürünün KDV tutarı: " + kdvTutari + " TL");
        System.out.println("Ürünün KDV'li tutarı: " + kdvliTutar + " TL");

    }
}
