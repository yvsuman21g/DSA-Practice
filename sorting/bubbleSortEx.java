import java.util.Scanner;

public class bubbleSortEx {

    public static void printSorting(int num[]) {
        int n = num.length;
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the input values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // sorting 
        int n = arr.length;
        boolean didSwap = true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = true;
                }
            }
            if(didSwap == false){
                break;
            }
        }

        printSorting(arr);
        sc.close();
    }
}   
