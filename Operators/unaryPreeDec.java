import java.util.Scanner;
public class unaryPreeDec {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;

        b = --a;

        System.out.println("a value is: "+a);
        System.out.println("b value is: "+b);
        sc.close();
    }
}
