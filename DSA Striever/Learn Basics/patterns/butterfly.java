
import java.util.Scanner;

public class butterfly {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user input");
        int n = sc.nextInt();

        // part 1 - Upper half code
        for (int i = 1; i <= n; i++) {

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // for space
            int space = 2*(n-i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

        // part 2 lower half code

         for (int i = n; i >= 1; i--) {

            // for stars
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            // for space
            int space = 2*(n-i);
            for (int j = space; j >= 1; j--) {
                System.out.print(" ");
            }

            // for stars
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        
        sc.close();
    }
}
