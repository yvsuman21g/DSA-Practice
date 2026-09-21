import java.util.Scanner;

public class countDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);                                                                                                                                                                                                                

        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            count = count + 1;
            num = num / 10;
        }
        System.out.print("Total number of the digit count is: "+count);
    }
}
