package patterns;

public class diamond_number_pattern {
    public static void main(String[] args) {

        int n = 5;
        int sp = n/2;
        int st = 1;
        int val = 1;
        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=sp; j++){
                System.out.print("  ");
            }
            int k =  val;

            for(int j = 1; j<=st; j++){
                System.out.print(k+" ");
                if (j<=st/2) {
                    k++;
                }else{
                    k--;
                }
            }

            if(i<=n/2){
                sp--;
                st+=2;
                val++;
            }
            else{
                sp++;
                st-=2;
                val--;
            }
            System.err.println();
        }
    }
}
