import java.util.Scanner;

public class printFebonacci {

    public static void printFeboSeries(int num) {

        if (num < 1) {
            System.out.print("Invalid number of terms: ");
        }

        int prev2 = 0;
        int prev1 = 1;

        // Enter the first febonacci number
        System.out.print(prev2 + " ");

        // if n = 1 stop here
        if (num == 1) {
            return;
        }
        System.out.print(prev1 + " ");

        for (int i = 3; i <= num; i++) {
            int curr = prev1 + prev2;
            System.out.print(curr+" ");
 
            prev2 = prev1;
            prev1 = curr;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User input number: ");
        int num = sc.nextInt();

        printFeboSeries(num);
        sc.close();
    }
}
