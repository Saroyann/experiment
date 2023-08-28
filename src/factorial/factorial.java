package factorial;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number:");
        int number = input.nextInt();
        input.close();
        int i,fact = 1;
        try {
            for (i = 1 ; i <= number ; i++) {
                fact = fact*i;
            }
            System.out.println("factorial of " + number + " is" + fact);
        } catch (Exception e) {
            System.out.println("something went wrong");
        }

    }
}
