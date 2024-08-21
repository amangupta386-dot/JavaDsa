package patterns;

public class arrow_pattern {

    public static void main(String[] args) {
        int n = 11;

        // for (int i = 1; i <= n/2; i++) {
        //     for(int j = 1; j<=n/2; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= 1; i++) {
        //     for(int j = 1; j<=n; j++){
        //         System.out.print("* ");
        //     }
        // }
        // System.out.println();
        // for (int i = 1; i <= n/2; i++) {
        //     for(int j = 1; j<=n/2; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j<=n/2-i+1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    
        int sp = n/2;
        int st = 1;
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=sp; j++){
                if (i==n/2+1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }   

            for(int j = 1; j<=st; j++){
                System.out.print("* ");
            }

            if(i<=n/2){
                st++;
            }else{
                st--;
            }

            System.out.println();
        }
    }
}
