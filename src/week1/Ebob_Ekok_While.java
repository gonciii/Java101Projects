package week1;


// Greatest common divisor and least common multiple  :  EBOB ve EKOK

import java.util.Scanner;

public class Ebob_Ekok_While {
    public static void main(String[] args) {
        // değişken tanımlama ve kullanıcı girişi için scanner sınıfı :
        Scanner scan = new Scanner(System.in);
        System.out.print("n1 :");
        int n1 = scan.nextInt();
        System.out.print("n2 : ");
        int n2 = scan.nextInt();

        // ortak bölen sayı ve ebob kontrolü için while döngüsü :
        int i = 1;
        int ebob = 1;
        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("Ortak bölen sayılar :" + i );
                ebob = i;
            }
            // sayaç
            i++;
        }
        // ekok : (n1*n2)/ ebob
        System.out.println("Ebob(a,b) = " + ebob);
        System.out.println("Ekok(a,b) = " + (n1 * n2 / ebob));
    }
}
