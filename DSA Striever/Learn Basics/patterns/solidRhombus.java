/*
    *****
   *****
  *****
 *****
*****

solid Rohombus Patterns
*/

import java.util.Scanner;

public class solidRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers");

        int num = sc.nextInt();
        // row --
        for (int i = 1; i <= num; i++) {

            int space = num - i;
            // for the spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // for the stars
            for (int j = 0; j <= num; j++) {
                System.out.print("*");
            }

            // for the spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
            sc.close();
        }
    }
}
