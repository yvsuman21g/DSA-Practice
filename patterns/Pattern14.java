/**



 */

public class Pattern14 {

    public static void main(String[] args) {
        int firstPrint = 6;
        patternPrint(firstPrint);

        int secondPrint = 5;
        patternPrint(secondPrint);
    }

    public static void patternPrint(int n) {

        // outer loop for the rows
        for (int i = 0; i <= n; i++) {

            // 1st Inner loop for the Coulmns and connect with Rows
            for (char ch='A'; ch <='A' + i; ch++){
                System.out.print(ch + " ");
            }

            System.out.println();

        }
        System.out.println();
    }
}