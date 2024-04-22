package week1;

// Dik Üçgende Hipotenüs Bulan Program
//Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        // değişkenleri belirleyelim:
        int a,b;
        double c ;

        // scanner sınıfını kullanarak kullanıcıdan veri alalım :
        Scanner input = new Scanner(System.in);
        System.out.print("1.kenarı giriniz: ");
        a = input.nextInt();
        System.out.print("2.kenarı giriniz: ");
        b = input.nextInt();

        // pisagor teorimini kullanarak 90 derecenin karşısındaki kenarı hesaplayalım.
        // Math.sqrt sınıfını kullanarak karekök hesaplaması yapalım:

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);


    }
}
