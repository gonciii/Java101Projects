package week2;

/*
            "Palindrome Number"
palindrome numbers : 1, 4, 8, 99, 101, 363, 4004, 9889....
 */
public class PalindromeNumber {
    // is it palindrome number or no ?
    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.println("**********************");
            System.out.println("Number => " + temp);

            // last digit number :
            lastNumber = temp % 10;
            System.out.println("Last digit => " + lastNumber);

            // last digit number -> became the first digit number
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("New number => " + reverseNumber);

            // to delete the last digit:
            temp /= 10;
            System.out.println("New temp => " + temp);
        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(99));    // true
        System.out.println(isPalindrome(215));   // false

    }
}
