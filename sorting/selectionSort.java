import java.util.Scanner;

public class selectionSort {

    public static void printSort(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        
        int size = sc.nextInt();
        
        // Create an array -
        int num[] = new int[size];

        // for loop for input of array elements -
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        // print slection sort -
        for (int i = 0; i < num.length - 1; i++) {
            int smallest = i;
            for (int j = i+1; j < num.length; j++) {
                if (num[smallest] > num[j]) {
                    smallest = j;
                }
            }

            int temp = num[smallest];
            num[smallest] = num[i];
            num[i] = temp;
        }
        printSort(num);
        sc.close();
    }
}
