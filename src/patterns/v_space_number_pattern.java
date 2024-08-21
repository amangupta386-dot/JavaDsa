package patterns;

public class v_space_number_pattern {

    public static void main(String[] args) {
        int n = 4;
        
        for(int i = 0;i<n; i++){
            int k = 1;
            for(int j = 0;j<=i; j++, k++){
               System.out.print(k+" ");
            }

            for(int j = i;j<=n-i; j++){
               
                System.out.print("- ");
             }
             k = i+1;
             for(int j = 0;j<=i; j++, k--){
                if(i==n-1 && j==n-1){
                    System.out.print(" ");
                    
                }else
                System.out.print(k+" ");
             }

            System.out.println();
        }
    }
}
