public class Rotate_a_number {
    public static void main(String[] args) {

        int n = 273516;
        int k = 2;

        if (k > 0) {
            for (int i = 0; i < k; i++) {
                int r = n % 10;
                n = n / 10;
                String str1 = String.valueOf(n);
                int powerOf10WithR = (int) Math.pow(10, str1.length()) * r;
                n = n + powerOf10WithR;
            }

            System.out.println(n);
        }
        if (k < 0) {
            k = Math.abs(k);
            for (int i = 0; i < k; i++) {
                String str1 = String.valueOf(n);
                int powerOf10 = (int) Math.pow(10, str1.length() - 1);
                int r = n % powerOf10;
                n = n / powerOf10;
                n = r * 10 + n;

            }
            System.out.println(n);

        }

        // ------------------------method 2-------------------------
        // Convert the integer to a string
        // String str = String.valueOf(n);

        // // Get the length of the number
        // int length = str.length();

        // // Adjust k for the effective rotation
        // k = k % length;
        // if (k < 0) {
        //     k = length + k;
        // }

        // // Split and concatenate the string
        // String rotatedStr = str.substring(length - k) + str.substring(0, length - k);

        // // Convert the rotated string back to an integer
        // int rotatedNumber = Integer.parseInt(rotatedStr);

        // System.out.println(rotatedNumber);

        // ------------------------method 3------------------------- 

    }
}
