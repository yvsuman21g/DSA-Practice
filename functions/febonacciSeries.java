import java.util.Scanner;

public class febonacciSeries {
    public static void calFebonacciNum(int num) {
        if (num <= 0) {
            System.out.print("Number is invalid");
        }

        int prev2 = 0, prev1 = 1;
        System.out.print(prev2 + " " + prev1 + " ");

        for (int i = 2; i < num; i++) {
            int curr = prev2 + prev1;
            System.out.print(curr + " ");
            prev2 = prev1;
            prev1 = curr;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User input: ");
        int num = sc.nextInt();

        calFebonacciNum(num);

        sc.close();
    }
}
