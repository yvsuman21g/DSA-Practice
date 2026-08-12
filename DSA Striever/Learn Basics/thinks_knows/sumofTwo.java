import java.util.Scanner;

public class sumofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sumofTwoNum(a, b);
        sc.close();
    }

    public static int sumofTwoNum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of 2 numbers is: " + sum);
        return 0;
    }
}
