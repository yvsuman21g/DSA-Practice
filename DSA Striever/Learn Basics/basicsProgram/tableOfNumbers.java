import java.util.Scanner;

public class tableOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers to run that number table");
        int i = sc.nextInt();

        int j = 1;
        while (j <= 10) {
            System.out.println(i * j);
            j++;
        }
        sc.close();

    }

}
