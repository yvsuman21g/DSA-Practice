import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Print values in row
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1); // Update value using nCr relation
            }

            System.out.println();
        }

        sc.close();
    }
}
