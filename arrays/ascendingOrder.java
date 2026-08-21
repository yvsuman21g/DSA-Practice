import java.util.Scanner;

public class ascendingOrder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        // create the array in java
        int numbers[] = new int[size];

        System.out.print("Enter the User input numbers: ");
        // input from the users
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        // loop
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.print("The array is sorted in Ascending Order");
        } else {
            System.out.print("The array is not sorted in Ascending Order");
        }
        sc.close();
    }
}