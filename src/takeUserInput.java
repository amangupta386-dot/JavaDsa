import java.util.ArrayList;
import java.util.Scanner;

public class takeUserInput {

    public static void main(String[] args) {    
        // Scanner sc = new Scanner(System.in);
        int a = 65784383;
        ArrayList arr = new ArrayList();
        while (a>0) {
            arr.add(a%10);
            a = a / 10;
        }
        System.out.println(arr);
        
    }
}
