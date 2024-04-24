package week1;

// Java ile mat,fizik,kimya,türkçe,tarih,müzik derslerinin sınav puanlarını kullanıcıdan alıp ortalama hesaplayan program yazalım.

import java.util.Scanner;
/*
Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
Not: Ternary Operator ya da Switch Case kullanarak yapılacak.
 */

public class Average_Grade_Calculator {
    public static void main(String[] args) {
        // Değişkenleri oluştur :
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfını tanımla :
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al :
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        // ortalama hesaplama :
        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam / 6.0;
        System.out.println("Not Ortalamanız: " + ortalama);

        // Ternary Operator ile sonuç döndür :

        String sonuc = (ortalama > 60) ? "Sınıfı geçtiniz :)  " : "Snıfta kaldınız :( ";
        System.out.println("Not ortalaması : " + ortalama+ "  " +sonuc);


    }
}
