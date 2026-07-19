
/**

****
*  *
*  *
****
*****
*   *
*   *
*   *
*****

 */

public class Pattern21 {

    public static void main(String[] args) {
        int firstPrint = 4;
        patternPrint(firstPrint);

        int secondPrint = 5;
        patternPrint(secondPrint);
    }

    public static void patternPrint(int n) {

        // outer loop for the rows
        for (int i = 0; i < n; i++) {

            // column loop and connect with rows
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}