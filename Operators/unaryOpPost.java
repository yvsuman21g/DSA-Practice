import java.util.Scanner;

public class unaryOpPost {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a input value: ");

        // 1 - Use Value
        // 2 - Change Value

        int a = sc.nextInt();
        int b = 0;

        // post Operator -
        b = a++;
        System.out.println("Inut a Value is: "+a);
        System.out.println("Input b Value is: "+b);
        sc.close();
    }
}
