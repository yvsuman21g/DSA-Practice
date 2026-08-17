import java.util.Scanner;

public class multiplyTwoNumbers {

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");

        int first = sc.nextInt();

        System.out.print("Enter the second Number: ");
        int second = sc.nextInt();
        
        System.out.print(multiplyNumbers(first, second));
        sc.close();
    }
}
