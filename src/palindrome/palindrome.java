package palindrome;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number to check the palindrome:");
        int n = input.nextInt();
        input.close();

        if(isPalindrome(n)) {
            System.out.println(n + " is palindrome");
        } else {
            System.out.println(n + " is not palindrome");
        }

    }

}

public  static boolean isPalindrome(int number) {

        }
