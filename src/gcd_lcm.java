public class gcd_lcm {

    // public static int gcd(int a, int b) {
    //     if (b == 0) {
    //         return a;
    //     } else {
    //         return gcd(b, a % b);
    //     }
    // }

    // public static int lcm(int a, int b) {
    //     return (a * b) / gcd(a, b);
    // }

    public static int gcd(int a, int b){
        int i = 2;
        int c = 1;
        while (a>1 || b>1) {
            while(a % i == 0 && b % i == 0){
                a = a / i;
                b = b / i;
                c = c * i;
            }
            if(a % i == 0){
                a = a/i;
            }
            else if(b % i == 0){
                b = b/i;
            }
            i++;
        }
        return c;
    }


    public static int lcm(int a, int b){
        int i = 2;
        int c = 1;
        while (a>1) {
            // while(a % i == 0 && b % i == 0){
            //     a = a / i;
            //     b = b / i;
            //     c = c * i;
            //     System.out.println(i);
            // }
            
            while(a % i == 0){
                a = a / i;
                c = c * i;
                System.out.println(i);
            }
            // else if(b % i == 0){
            //     b = b/i;
            //     c = c * i;
            // }
            i++;
        }
        return c;
    }

    public static void main(String[] args) {
         int a = 1440;
         int b = 24;

         lcm(a, b);
        //  int lcm = lcm(a, b);
        //  System.out.println(gcd);
        //  System.out.println(lcm);
    }
}
