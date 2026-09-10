/* 

    *     
   * *    
  * * *   
 * * * *  
* * * * * 
 * * * *  
  * * *   
   * *    
    *  


*/


import java.util.Scanner;

public class diamond {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of n: ");
        int n = sc.nextInt();

        // Above Outer loop for the Row -
        for (int i = 1; i <= n; i++) {

            // spaces -
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars -
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            // spaces -

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        // below or Reverse pattern print
        // row loop
        for (int i = 1; i <= n - 1; i++) {

            // space loop -
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // stars -
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*"+" ");
            }

            // spaces -
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
