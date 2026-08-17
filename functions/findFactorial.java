import java.util.Scanner;

public class findFactorial {

    public static void calFactorial(int num){
        int fact = 1;
        for(int i=num; i >= 1; i--){
            fact *=i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for factorial: ");
        int fact = sc.nextInt();

        calFactorial(fact);
        sc.close();
    }

}
