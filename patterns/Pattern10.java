
/*
    *
**
***
****
*****
******
*******
******
*****
****
***
**
*

*
**
***
****
*****
******
*******
********
*********
********
*******
******
*****
****
***
**
*  

*/

public class Pattern10 {
    public static void main(String[] args) {
        int firstprint = 8;
        patternPrint(firstprint);

        int secondprint = 10;
        patternPrint(secondprint);
    }

    public static void patternPrint(int n) {

        // outer loop for the rows
        for (int i = 1; i < 2 * n - 1; i++) {

            int star = i;

            if (i > n) {
                star = 2 * n - i;
            }

            // inner loop for the columns
            for (int j = 1; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}