import java.util.Scanner;
import java.util.Arrays;                                                                                                                 

public class array {
    static void recursiveArrayReverse(int i, int arr[], int n){
    if(i >= n/2) return;

    int temp = arr[i];
    arr[i] = arr[n-i-1];
    arr[n-i-1] = temp;

    recursiveArrayReverse(i+1, arr, n-i-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // creatre an array -
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        recursiveArrayReverse(0, arr, arr.length);
        System.out.print(Arrays.toString(arr));
        sc.close();
    }
}
