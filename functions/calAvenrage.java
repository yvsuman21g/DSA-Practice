import java.util.Scanner;

public class calAvenrage {

    public static void printAverage(int num1, int num2, int num3) {

        int cal = ((num1 + num2 + num3) / 3);

        System.out.print("Average is: " + cal);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Input of User: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second Input of User: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third Input of User: ");
        int num3 = sc.nextInt();

        printAverage(num1, num2, num3);
        sc.close();
    }
}
