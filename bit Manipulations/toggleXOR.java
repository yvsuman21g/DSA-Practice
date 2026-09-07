
/* WAP to toggle a bit position= "pos" in a number n */
import java.util.Scanner;

public class toggleXOR {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number by User: ");
        int num = sc.nextInt();

        System.out.print("Enter the position buy user: ");
        int pos = sc.nextInt();

        // toggle means XOR opeartions

        // Step 1 bit manipulate -
        int bitMan = 1 << pos;

        // Step 2 - perform operations XOR with N
        int newBitMan = bitMan ^ num;
        System.out.println("Final result number is: " + newBitMan);
        sc.close();
    }
}
