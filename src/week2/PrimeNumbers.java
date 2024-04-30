package week2;

// Prime numbers with recursive function
import java.util.Scanner;

public class PrimeNumbers {
    static boolean isPrime(int n,int divisor) {
        // if the number is less tahan 2,its not prime
        if (n < 2) {
            return false;
        }
        // if the divisor is greater than n/2 , n is prime
        if ( divisor > n/2) {
            return true;
        }
        // if n is divisible by divisor, its not prime
        if (n % divisor == 0) {
            return false;
        }
        // recursively call isPrime function
        return isPrime(n,divisor+1);

    }
    public static void main(String[] args) {
        // get user inpuut for a number
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scan.nextInt();
        // result
        if (isPrime(number,2)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }


    }

}
