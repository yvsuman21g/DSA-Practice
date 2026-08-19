import java.util.Scanner;

public class powOfNum {

    public static void calPowOfAnotherNum(double num, double pow) {
        double cal = Math.pow(num, pow);
        System.out.print(cal);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number X: ");
        int x = sc.nextInt();

        System.out.print("Enter the pow number n: ");
        int n = sc.nextInt();

        calPowOfAnotherNum(x, n);
        sc.close();
    }
}
