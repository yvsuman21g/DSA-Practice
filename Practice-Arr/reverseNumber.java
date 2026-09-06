import java.util.Scanner;
public class reverseNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the User Input number: ");

        int number = sc.nextInt();
        int rev = 0;

        while(number != 0){
            int num = number % 10;
            rev = rev * 10 + num;
            number = number / 10;
        }
        System.out.println("Reverse number is: "+ rev);
        sc.close();
    }
}
