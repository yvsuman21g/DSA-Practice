import java.util.Scanner;

public class tableOfNumber {

    public static void printTable(int num) {
        int table = 1;
        for (int i = 1; i <= 10; i++) {
            table = num * i;
            System.out.println(table);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User imput Number: ");
        int num = sc.nextInt();

        printTable(num);
        sc.close();
    }
}
