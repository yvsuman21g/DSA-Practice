import java.util.Scanner;
public class unaryPostDec {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value User Input: ");
        int a = sc.nextInt();
        int b = 0;

        b = a--;
        System.out.println("a value is: "+a);
        System.out.println("b value is: "+b);

        sc.close();
    }
}
