/**
    
E
DE
CDE
BCDE
ABCDE
@ABCDE

E
DE
CDE
BCDE
ABCDE

 */

public class Pattern18 {

    public static void main(String[] args) {
        int firstPrint = 6;
        patternPrint(firstPrint);

        int secondPrint = 5;
        patternPrint(secondPrint);
    }

    public static void patternPrint(int n) {

        // outer loop for the rows
        for (int i = 0; i < n; i++) {

            // 1st inner loop for the spaces
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }

            System.out.println();

        }
        System.out.println();
    }
}