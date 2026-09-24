import java.util.Scanner;
public class functionReturn {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User Input for n: ");
        int num = sc.nextInt();
        System.out.print(sum(num));
        sc.close();
    }
}
