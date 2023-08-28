package palindrome;

import java.util.Scanner;

public class palindromeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number to check the palindrome:");
        int n = input.nextInt();
        input.close();

        if(isPalindrome(n)) {
            System.out.println(n + " is palindrome");
        }else if(n < 0) {
            System.out.println("i can't do palindrome on less than 1 or negative number bro");
        }else {
            System.out.println(n + " is not palindrome");
        }

    }

    public  static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;

        while(number > 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }
        return  originalNumber == reverseNumber;
    }

}


