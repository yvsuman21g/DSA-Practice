import java.util.Scanner;

public class sumOfOddNum {

    public static void calSumOfOddNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.print("Sum of all Odd Numbers are: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the user input number: ");
        int num = sc.nextInt();
        calSumOfOddNum(num);

        sc.close();
    }
}
