/* 
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
1 2 3 4 5 
*/

import java.util.Scanner;

public class mirrorImageTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n: ");

        int n = sc.nextInt();

        // Upper pattern -
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Number and Space
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Below Pattern -
        for (int i = 1; i <= n-1; i++) {
            // spaces -
            for (int j = 1; j <= n-i-1; j++) {
                System.out.print(" ");
            }
            // Number with Space -
            for (int j = n-i; j <= n; j++) {
                System.out.print(j+" ");
            }
             System.out.println();
        }

        sc.close();
    }
}
