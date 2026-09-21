import java.util.Scanner;

public class armStrongNumb {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ther user input: ");
        int num = sc.nextInt();
        int original = num;

        int temp = Math.abs(num);

        // for loop count the digit of the number -
        int count = 0;
        if (num == 0) {
            count = count + 1;
        } else {
            for (int i = temp; i > 0; i = i / 10) {
                count++;
            }
        }
        int sum = 0;
        int checkNum = temp;
        while (checkNum > 0) {
            int rem = checkNum % 10;
            sum += Math.pow(rem, count);
            checkNum = checkNum / 10;
        }

        if (original == sum) {
            System.out.print("This is ArnStrong Number");
        } else {
            System.out.print("This is not an ArnStrong Number");
        }
        sc.close();
    }
}
