
/**



 */

public class Pattern22 {

    public static void main(String[] args) {
        int firstPrint = 4;
        patternPrint(firstPrint);

        int secondPrint = 5;
        patternPrint(secondPrint);
    }

    public static void patternPrint(int n) {
        // outer loop for the rows
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;

                int value = n - (min(min(top, down), min(left, right)));
                System.out.print(value);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int min(int a, int b) {
        return (a < b) ? a : b;
    }
}