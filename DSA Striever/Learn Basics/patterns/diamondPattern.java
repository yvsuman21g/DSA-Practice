
/* 
Diamond Pattern -
            *
          * * *
        * * * * *
      * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *

*/
import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User input number: ");
        int num = sc.nextInt();

        // for loop for the number of rows -
        for (int i = 1; i <= num; i++) {

            // Spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        // lower half -

        for (int i = num; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        sc.close();
    }
}
