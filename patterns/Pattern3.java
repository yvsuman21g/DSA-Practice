
/**
1 
1 2 
1 2 3 
1 2 3 4 

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
 */


import java.util.Scanner;

public class Pattern3 {
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
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " "); // Print the number in the current column
            }
            System.out.println(); // Move to the next line after each row
        }
        System.out.println(); // Print an empty line after each pattern
    }
}
