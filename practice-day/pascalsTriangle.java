/*  1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

*/

import java.util.Scanner;

public class pascalsTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User input n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Space loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // for loop for numbers with spaces -
            int val = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(val + " ");

                // Compute next value using your 1-based index (k)
                val = val * (i - k) / k;
            }
            System.out.println();

        }
        sc.close();
    }
}
