import java.util.Scanner;

public class minMax {

    public static int calMinMax(int a, int b) {

        if (a > b) {
           System.out.println("Max Number is: "+ a); 
           System.out.println("Min Number is: "+ b);
        }
        else {
            System.out.println("Max Number is: "+ b);
            System.out.println("Min Number is: "+ a);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        calMinMax(a, b);

        sc.close();
    }
}
