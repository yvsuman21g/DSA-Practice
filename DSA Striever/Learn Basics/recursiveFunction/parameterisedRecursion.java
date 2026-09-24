import java.util.Scanner;

public class parameterisedRecursion {

    static void recursiveParameterisedFn(int i, int sum) {
        if (i < 0) {
            System.out.println(sum);
            return;
        }
        recursiveParameterisedFn(i - 1, sum + i);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User input of n: ");

        int num = sc.nextInt();
        recursiveParameterisedFn(num, 0);
        sc.close();
    }
}
