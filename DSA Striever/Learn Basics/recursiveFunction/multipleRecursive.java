
import java.util.Scanner;

public class multipleRecursive {

    static int febonacciSeries(int num) {
        if (num <= 1) {
            return num;
        }

        int last = febonacciSeries(num - 1);
        int sLast = febonacciSeries(num - 2);

        return last + sLast;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input of User of for febonacci number: ");
        
        int num = sc.nextInt();
        System.out.print(febonacciSeries(num));

        sc.close();

    }

}
