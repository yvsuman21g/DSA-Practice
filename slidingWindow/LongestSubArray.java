
import java.util.Scanner;

public class LongestSubArray {

    public static int calSubArray(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int left = 0;
        int right = 0;
        int maxLength = 0;

        int start = -1;
        int end = -1;

        while (right < n) {
            sum = sum + arr[right];

            while (sum > k && left <= right) {
                sum = sum - arr[left];
                left++;
            }

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
                end = right;
            }

            right++;
        }

        System.out.print("Longest SubArray: ");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        return maxLength;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        int k = 14;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Length: " + calSubArray(arr, k));

        sc.close();
    }
}
