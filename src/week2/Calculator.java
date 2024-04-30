package week2;

// Calculator

import java.util.Scanner;

public class Calculator {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Fark: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpım : " + result);
        return result;
    }

    static float divided(float a, float b) {
        if (b == 0) {
            return 0;
        }
        float result = (a / b);
        System.out.println("Bölüm : " + result);
        return result;

    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void rectangle(int a, int b) {
        System.out.println("Dikdörtgen'in çevresi : " + (2 * (a + b)));
        System.out.println("Dikdörtgen'in alanı : " + (a * b));
    }

    static void factorial(int a, int b) {
        int result1 = 1;
        for (int i = 1; i <= a; i++) {
            result1 *= i;
        }
        int result2 = 1;
        for (int i = 1; i <= b; i++) {
            result2 *= i;
        }
        System.out.println(a + "!" + "=" + result1);
        System.out.println(b + "!" + "=" + result2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu;
        menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Mod Alma
                7- Dikdörtgen Alan ve Çevre Hesabı
                8- Faktoriyel Hesaplama
                0- Çıkış Yap""";


        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz :");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }
            System.out.print("1.Sayı : ");
            int a = scan.nextInt();
            System.out.print("2.Sayı : ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    if (divided(a, b) == 0) {
                        System.out.println("Sıfıra bölme hatası,2.sayıyı 0'dan farklı seçiniz !");
                    }
                    break;
                case 5:
                    System.out.println(("Üslü Kuvveti :" + power(a, b)));
                    break;
                case 6:
                    System.out.println("Mod'u :" + mod(a, b));
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                case 8:
                    factorial(a, b);
                    break;
                default:
                    System.out.println("Geçersiz işlem !");
            }
        }
        System.out.println(" Hesaplamdan çıkılıyor ...!");
    }

}
