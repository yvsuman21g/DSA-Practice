
/*
Input  : arr[] = [5, 2, -1, 0, 3], k = 3
Output : 6
Explanation : We get maximum sum by considering the subaarray [5, 2 , -1]

Input  : arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4 
Output : 39
Explanation : We get maximum sum by adding subarray [4, 2, 10, 23] of size 4.

*/
import java.util.Scanner;

public class SlidingW1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input Array Size
        System.out.println("Enter the Array Size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input K window size
        System.out.print("Enter SubArray size k");
        int k = sc.nextInt();

        int result = maxSumSubArray(arr, n, k);
        System.out.println("Maximum sum of the subarray of size, " + k + " = " + result);

        sc.close();

    }

    // Sliding window concepts
    public static int maxSumSubArray(int[] arr, int n, int k) {
        int current = 0;
        // calculate the 1st sliding window element
        for (int i = 0; i < k; i++) {
            current = current + arr[i];
        }

         int maxx = current; 

        // 2nd loop for the i+1 to n element sliding
        // 2nd loop for sliding
        for (int i = 1; i <= n - k; i++) {
            current = current - arr[i - 1] + arr[i + k - 1];
            if (current > maxx) {
                maxx = current;
            }
        }

        return maxx;

    }
}
