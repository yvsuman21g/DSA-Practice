import java.util.Scanner;

public class polindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(num < 0){
            System.out.print(false);
        }

        int original = num;
        int rev = 0;
        while(num !=0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(original == rev){
            System.out.print(true);
        } else {
            System.out.print(false);
        }
        sc.close();  
    }
}