package factorial;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        //with looping
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number:");
        int number = input.nextInt();
        input.close();
        int i,fact = 1;
        for (i = 1 ; i <= number ; i++) {
            fact = fact*i;
        }
        System.out.println("factorial of " + number + " is " + fact);



    }
}


