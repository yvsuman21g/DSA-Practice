import java.util.Scanner;

public class spiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // Create an 2D array

        int matrix[][] = new int[n][m];

        System.out.println("Enter the inputs values of 2D array: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is: ");

        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = m - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            // Step 1 - for the top row so it'll move fromn col1b to end
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            // Step 2 - For the right side of the columns traverse from rowStart to rowEnd
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }

            colEnd--;

            // Trverse bottom row
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    System.out.print(matrix[rowEnd][col] + " ");
                }
            }
            rowEnd--;

            // traverse left col
            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    System.out.print(matrix[row][colStart] + " ");
                }
            }
            colStart++;

        }
        sc.close();

    }
}
