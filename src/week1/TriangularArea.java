package week1;

//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

/*
Hint :
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */

import java.util.Scanner;
public class TriangularArea {
    public static void main(String[] args) {
        // Scanner sınıfını kullanarak kullanıcıdan kenar uunluklarını alalım :
        Scanner input = new Scanner(System.in);

        System.out.println("Üçgen'in 1.kenar uzunluğunu giriniz:");
        double a = input.nextInt();

        System.out.println("Üçgen'in 2.kenar uzunluğunu giriniz:");
        double b = input.nextInt();

        System.out.println("Üçgen'in 3.kenar uzunluğunu giriniz:");
        double c = input.nextInt();

        // Üçgenin çevresi :

        double u = (a + b + c) / 2;
        double cevre = 2 * u;

        // Üçgenin alanı :

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // Ekran çıktısı için sonuçları yazdıralım :

        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);

    }
}
