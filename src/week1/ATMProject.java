package week1;

// ATM PROJECT With Switch-Case

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // definition variables :
        int right = 3;
        int balance = 2000;
        System.out.println("Welcome to ***  bank !");
        while (right > 0) {
            System.out.print("User name: ");
            String userName = scan.nextLine();
            System.out.print("Password: ");
            String password = scan.nextLine();

            switch (userName) {
                case "gonci":
                    switch (password) {
                        case "gonci00":
                            System.out.println("LOGIN SUCCESSFUl");
                            int select;
                            do {
                                System.out.println("1-Lodgement\n" + "2-Withdraw\n" + "3-Balance inquiry\n" + "4-Log out");
                                System.out.print("Please select the action you want to perform (1-4): ");
                                select = scan.nextInt();
                                switch (select) {
                                    case 1:
                                        System.out.print("Amount of money: ");
                                        int price = scan.nextInt();
                                        balance += price;
                                        System.out.println("Lodgement Successful. Your new balance: " + balance + " $");
                                        break;
                                    case 2:
                                        System.out.print("Amount of money: ");
                                        int withdrawAmount = scan.nextInt();
                                        if (withdrawAmount <= balance) {
                                            balance -= withdrawAmount;
                                            System.out.println("Withdraw Successful. Your new balance: " + balance + " $");
                                        } else {
                                            System.out.println("Insufficient balance!");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Your balance: " + balance + " $");
                                        break;
                                    case 4:
                                        System.out.println("See you next time !");
                                        return;
                                    default:
                                        System.out.println("Invalid selection. Please enter a number between 1 and 4.");
                                        break;
                                }
                            } while (select != 4);
                            return;
                        default:
                            right--;
                            System.out.println("LOGIN FAILED, your remaining attempts: " + right);
                            break;
                    }
                    break;
                default:
                    right--;
                    System.out.println("LOGIN FAILED, your remaining attempts: " + right);
                    break;
            }
        }
        System.out.println("Your account has been blocked. Please contact your bank!");
    }
}