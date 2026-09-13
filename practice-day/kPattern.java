/*

* * * * * 
* * * *  
* * *   
* *    
*     
* *    
* * *   
* * * *  
* * * * * 

*/

import java.util.Scanner;

public class kPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of n: ");
        int n = sc.nextInt();

        // Upper Part -
        for (int i = 1; i <= n; i++) {
            // star -
            for (int j = n; j >= i; j--) {
                System.out.print("*"+" ");
            }

            // space -
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // Below Part -
        for (int i = 1; i <= n - 1; i++) {
            // star -
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*"+" ");
            }

            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
