package kalkulator_sederhana;

import java.util.Scanner;

public class kalkulator_sederhana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("pilih operator aritmatika anda : 1. + \n 2. - \n 3. * \n 4. / \n pilihan anda :");
        int opt = sc.nextInt();
        System.out.println("bilangan pertama : ");
        int num1 = sc.nextInt();
        System.out.println("bilangan kedua : ");
        int num2 = sc.nextInt();

        switch(opt) {
            case 1: {
                int result = num1 + num2;
                System.out.println(num1 + " + "  + num2 + " = " + result);
                break;
            } case 2: {
                int result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            } case 3: {
                int result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            } case 4: {
                int result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } default: {
                System.out.println("you insert a wrong input");
            }
        }
    }
}
