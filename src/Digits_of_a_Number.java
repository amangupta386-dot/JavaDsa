import java.util.ArrayList;

public class Digits_of_a_Number {
    public static void main(String[] args) throws Exception {
        // Scanner scn = new Scanner(System.in);
        // int n = Integer.parseInt(scn.nextLine());
        // Scanner sc = new Scanner(System.in);

        //-------------------------------------method 1--------------------------------
        int a = 65784383;
        // ArrayList arr = new ArrayList();
        // while (a > 0) {
        //     arr.add(a % 10);
        //     a = a / 10;
        // }
        // System.out.println(arr);
        // reverse this array and print it

        //---------------------------------method 2--------------------------------  
    
        String str = String.valueOf(a);
        // ArrayList<Integer> arr = new ArrayList<>();
        // for (int i = 0; i < str.length(); i++) {
        //     arr.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        //     System.out.println(arr.get(i));
        // }
        // System.out.println(arr);
        // reverse this array and print it

        //---------------------------------method 3--------------------------------
        int n = (int) Math.pow(10, str.length() - 1);

        while (n>0) {
            int c = a/n;
            System.out.println(c);
            a = a % n;
            n=n/10;
        }
    }
}
