import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array so 2 variables as a input
        int n = sc.nextInt();
        int m = sc.nextInt();

        // create 2D arrays -
        int matrix[][] = new int[n][m];

        System.out.println("Enter the arrays values in format or rows and columns: ");

        // for loop for the Inputs
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Traspose means: Number of rows converts as numbers of Columns: ");
        // for loop for the Outputs -
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
