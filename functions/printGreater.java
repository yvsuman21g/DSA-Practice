import java.util.Scanner;

public class printGreater {

    public static void calGreaterNum(int num1, int num2){
        if(num1 > num2){
            System.out.print(num1+": is greater than "+num2);
        }
        else if(num1 < num2) {
            System.out.print(num2 +": is greater than "+num1);
        }
        else {
            System.out.print("Both numbers are equal");
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the firstNumber: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the user secondNumber: ");
        int num2 = sc.nextInt();

        calGreaterNum(num1, num2);

        sc.close();
    }
}
