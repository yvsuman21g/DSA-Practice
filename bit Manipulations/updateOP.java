
import java.util.Scanner;

public class updateOP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Operation - you want to perform either 0 or 1: ");

        int operation = sc.nextInt();

        int n = 5;

        // operations 1 - set and 0 - clear
        if (operation == 1) {
            int pos = 1;
            int bitMask = 1 << pos;
            int newBitMas = bitMask | n;
            System.out.println("New Set Number is: " + newBitMas);
        } else {
            int pos = 2;
            int bitMask = 1 << pos;

            int notBistMask = ~bitMask;
            int newBitmas = notBistMask & n;
            System.out.println("New Number is: " + newBitmas);
        }
        sc.close();
    }
}
