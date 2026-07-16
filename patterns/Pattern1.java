
/*
Any program should be run for thousand of test cases -
* * * *
* * * *
* * * *
* * * *
*/
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstRow = 3;
        printPattern(firstRow);

        int secondRow = 5;
        printPattern(secondRow);

        sc.close();
    }

    public static void printPattern(int n) {
        // Outer loop for the number of rows
        for (int i = 0; i < n; i++) {
            // Inner loop for the number of columns
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(); // Print an empty line after each pattern
    }
}
