import java.util.Scanner;

public class maxSumObtainCards {

    static int calMaxSum(int[] nums, int k) {
        int n = nums.length;
        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            lSum = lSum + nums[i];
        }
        maxSum = lSum;

        int rIndex = n - 1;

        for (int i = k - 1; i >= 0; i--) {
            lSum = lSum - nums[i];

            rSum = rSum + nums[rIndex];
            rIndex = rIndex-1;

            maxSum = Math.max(maxSum, lSum+rSum);
        }

        return maxSum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the arraus: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the array input: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the window K value: ");
        int k = sc.nextInt();

        System.out.println(calMaxSum(nums, k));
        sc.close();
    }
}