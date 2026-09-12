import java.util.Scanner;

public class hollowDymondPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of n: ");
        int n = sc.nextInt();

        //Above Pattern     
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || i == 1 || j == (2 * i   - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }

        //  below pattern -

         for (int i = n-1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || i == 1 || j == (2 * i   - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }

        sc.close();

    }
}    
