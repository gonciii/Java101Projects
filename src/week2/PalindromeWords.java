package week2;

// Palindrome Word
import java.util.Scanner;

public class PalindromeWords {
    static boolean isPalindrome(String str) {
        // madam = ? madam
        int i=0;
        int j=str.length() -1;
        while (i<j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static void printPalindrome(String pWord) {
        // palindrome method for print to screen
        if (isPalindrome(pWord.toLowerCase())) {
            System.out.println(pWord + " is a palindrome word.");
        } else {
            System.out.println(pWord + " is not palindrome word.");
        }
    }


    public static void main(String[] args) {
        // scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String palindromeWord = scanner.nextLine();

        printPalindrome(palindromeWord);

    }
}
