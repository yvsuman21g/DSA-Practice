/* 

   1    
   212   
  32123  
 4321234 
543212345

*/

import java.util.Scanner;

public class palindromeTriangular {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // loop for the spaces -
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // loop for the numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }

            //  right side of the pyramid
            int start = 2;
            if (i >= 2) {
                start = 2;
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(start);
                start = start + 1;
            }

            //  right side spaces -
            // loop for the spaces -
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}