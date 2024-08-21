import java.util.Scanner;

public class Inverse_of_a_number {

    public static void main(String[] args) {
        int a = 81456273;
        int p = 1;
        int result = 0;
        while (a>0) {
            int r = a%10;
            a = a /10;
            int n = (int) Math.pow(10, r - 1);
             result = p * n + result;
            p++;
        }
        System.out.println(result);
    }
}