/**
   ************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
********** 

 */

public class Pattern19 {

    public static void main(String[] args) {
        int firstPrint = 6;
        patternPrint(firstPrint);

        int secondPrint = 5;
        patternPrint(secondPrint);
    }

    public static void patternPrint(int n) {

        // outer loop for the rows
        for (int i = 0; i < n; i++) {
            // above half portion need to print

            // 1st inner loop for the star
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // 2nd inner loop for the spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // 3rd inner loop for the star
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // below half portion need to print
        // outer loop for the rows
        for (int i = 0; i < n; i++) {
            // 1st Inner loop for the reverse star
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // 2nd inner loop for the spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // 3rd Inner loop for the reverse star
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

             System.out.println();
        }


        System.out.println();
    }
}