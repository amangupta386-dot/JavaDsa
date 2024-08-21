package patterns;

public class arrow_pattern {

    public static void main(String[] args) {
        int n = 11;

        for (int i = 1; i <= n/2; i++) {
            for(int j = 1; j<=n/2; j++){
                System.out.print("  ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i <= 1; i++) {
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
        }
        System.out.println();

        for (int i = 1; i <= n/2; i++) {
            for(int j = 1; j<=n/2; j++){
                System.out.print("  ");
            }

            for(int j = 1; j<=n/2-i+1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
