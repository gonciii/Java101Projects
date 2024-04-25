package week1;

/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

import java.util.Scanner;
public class UserLoginPassword {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // correct information
        String correctPassword="java123";

        // get password from user
        System.out.print("Please enter password: ");
        String password = input.nextLine();

        // if-else control :
        if (password.equals(correctPassword)) {
            System.out.println("Login successful !");
        } else {
            System.out.print("Wrong password,Do you want to reset the password ? ");
            String resetPassword = input.nextLine();

            if (resetPassword.equalsIgnoreCase("YES")) {
                System.out.print("Pleas enter your new password :");
                String newPassword = input.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("The new password cannot be the same as the old password. The password could not be created, please enter another password.");
                } else {
                    System.out.println("New password created !");
                }
            } else {
                System.out.println("Password reset has been canceled,please try again later !");
            }
        }










    }
}
