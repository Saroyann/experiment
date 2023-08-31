package factorial;
import java.util.Scanner;

public class factorialWithRecursion {

    static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return(n * factorial(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number bro:");
        int number = input.nextInt();
        input.close();
        int i,fact = 1;
        fact = factorial(number);

        System.out.println("factorial of " + number + " is " + fact);
    }
}
