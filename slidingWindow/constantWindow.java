import java.util.Scanner;

public class constantWindow {

    public static int calSumWindow(int arr[], int k) {
        int n = arr.length;
        if (k <= 0 || k > n) {
            System.out.println("K Windows is invalid");
        }

        
        int sum = 0;
        int maxSum = 0;

        // 1st loop for printing the sum -
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        maxSum = sum;
        int left = 0;
        int right = k-1;

        // while loop for calculate the maxSum of Consecutive windows -
        while (right < n) {
            sum -= arr[left];
            left++;
            sum += arr[right];
            right++;
            maxSum = Math.max(maxSum, sum);
        }

       

        return maxSum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // size of the arrays elements -
        int size = sc.nextInt();

        // create an 1D array -
        int[] arr = new int[size];
        int k = 4;

        // input of the arrays -
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(calSumWindow(arr, k));

        sc.close();
    }
}