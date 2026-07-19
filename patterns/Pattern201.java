/**

*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

PS C:\Users\Admin\DSA-Practice\patterns> javac Pattern20.java
PS C:\Users\Admin\DSA-Practice\patterns> java Pattern20      
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

 */

public class Pattern201 {

    public static void main(String[] args) {
        int firstPrint = 6;
        patternPrint(firstPrint);

        int secondPrint = 5;
        patternPrint(secondPrint);
    }

    public static void patternPrint(int n) {
        // outer loop for the rows
        for (int i = 1; i < 2 * n; i++) {

            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }

            // spaces should depend on stars
            int spaces = 2 * (n - stars);

            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
    }

}