import java.util.Scanner;

public class unaryOpPree {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value of Input: ");

        // 1 - Change Value
        // 2 - Use Value

        int a = sc.nextInt();
        int b = 0;

        b = ++a;
        System.out.println("Value of a is: "+b);
        System.out.println("Value of b is: "+a);
        
        sc.close();
    }
}
