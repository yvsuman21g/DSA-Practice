import java.util.Scanner;
import java.util.Arrays;

public class arrayTwoPointer {
    static void recursiveTwoPointerArr(int arr[], int l, int r) {
        if (l >= r) return;

        // swap -
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        recursiveTwoPointerArr(arr, l+1, r-1);

    }
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // create an array -
        int arr [] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        recursiveTwoPointerArr(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
        sc.close();
    }
}
   