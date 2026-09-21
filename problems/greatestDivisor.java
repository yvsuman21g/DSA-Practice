import java.util.Scanner;

public class greatestDivisor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // int greatDiv = 1;
        int rem = 0;
        if (num1 > num2) {
            while (num2 != 0) {
                rem = num2;
                num2 = num1 % num2;
                num1 = rem;
            }
            System.out.print(rem);
        } else {
            while (num1 != 0) {
                rem = num1;
                num1 = num2 % num1;
                num2 = rem;
            }
            System.out.print(rem);
        }
        
    }
}
