/*

 * * * * *
 *       *
 *       *
 *       *
 * * * * *
 
 */

import java.util.Scanner;
public class squareHollowPattern {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user input of n: ");

        int n = sc.nextInt();

        // this loop for the Outer rows
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                // logic -
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
        sc.close();
    }
}
   