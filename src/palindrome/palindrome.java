package palindrome;

public class palindrome {

    public static void main(String[] args) {
        int r,sum = 0,temp;
        int n = 454; // check the number palindrome

        temp = n;
        while(n>0) {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10
        }
    }

}
