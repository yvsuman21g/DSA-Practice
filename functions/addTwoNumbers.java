import java.util.Scanner;

public class addTwoNumbers {

    public static int calculateSum(int firstNum, int secondNum){
        int sum = firstNum + secondNum;
        return sum;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int first = sc.nextInt();

        System.out.print("Enter the Second number: ");
        int second = sc.nextInt();



        int sum = calculateSum(first, second);
        System.out.println(sum);

        sc.close();
    }
}
