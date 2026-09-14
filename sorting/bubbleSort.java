package sorting;

import java.util.Scanner;

public class bubbleSort {

    public static void bubble_Sort(int[] numbers) {
        int n = numbers.length;
        boolean swapped;

        for (int k = n - 1; k >= 1; k--) {
            swapped = false;
            for (int j = 0; j <= k - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        // Print array inside this function after sorting completes
        System.out.print("Sorted array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arrays is: ");
        int size = sc.nextInt();

        // create 1D array -
        int numbers[] = new int[size];

        System.out.print("Enter the aerrays values: ");

        // for loop for array inputs -
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        sc.close();
    }
}