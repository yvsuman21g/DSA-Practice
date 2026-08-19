import java.util.Scanner;

public class greatestCommonDivisor {

    public static void calGCD(int num1, int num2) {
        int maxDiv = 1;
        for (int i = 2; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                maxDiv = i;
            }
        }
        System.out.print(maxDiv);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Input of User: ");
        int first = sc.nextInt();

        System.out.print("Enter the second Input of User: ");
        int second = sc.nextInt();

        calGCD(first, second);

        sc.close();

    }
}
