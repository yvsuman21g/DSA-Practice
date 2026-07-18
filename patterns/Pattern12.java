/**

1          1
12        21
123      321
1234    4321
12345  54321
123456654321

1        1
12      21
123    321
1234  4321
1234554321

 */

public class Pattern12 {

    public static void main(String[] args) {
        int firstPrint = 6;
        patternPrint(firstPrint);

        int secondPrint = 5;
        patternPrint(secondPrint);
    }

    public static void patternPrint(int n) {

        // int space = 2* (n-1);

        // outer loop for the rows
        for (int i = 1; i <= n; i++) {

            // 1st Inner loop for the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // 2nd inner loop for the spaces
            for (int j = 1; j <= ((2*n)-(2*i)); j++) {
                System.out.print(" ");
            }

            // 3rd loop for the again reverse numbers

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // space -= 2;

            System.out.println();

        }
        System.out.println();
    }
}