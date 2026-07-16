/* 

* * * * *
* * * *
* * * 
* *
*

*/

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstRows = 5; // Number of rows for the pattern
        patternPrint(firstRows);

        int secondRows = 8;
        patternPrint(secondRows);
        sc.close();
    }

    public static void patternPrint(int n) {
        // Loop thrrogh each row
        for (int i = n; i > 0; i--) {
            for (int j = i; j >= 1; j--) {

                System.out.print(""); // Print the number in the current column
            }
            System.out.println(); // Move to the next line after each row
        }
        System.out.println(); // Print an empty line after each pattern
    }
}
