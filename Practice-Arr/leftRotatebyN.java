import java.util.Arrays;

public class leftRotatebyN {
    public static void main(String[] args) {
        leftRotatebyN sol = new leftRotatebyN();

        int[] num1 = {1, 2, 3, 4, 5, 6, 7};
        sol.leftrotateArraybyN(num1, 3); // rotate by 3

        int[] num2 = {5, 2, 7, 1, 7, 4};
        sol.leftrotateArraybyN(num2, 2); // rotate by 2
    }

    public void leftrotateArraybyN(int[] nums, int d) {
        int n = nums.length;
        d = d % n; // handle cases where d > n

        // Step 1: copy first d elements into temp
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = nums[i];
        }

        // Step 2: shift the rest of the array left
        for (int i = d; i < n; i++) {
            nums[i - d] = nums[i];
        }

        // Step 3: put temp elements at the end
        for (int i = 0; i < d; i++) {
            nums[n - d + i] = temp[i];
        }

        // Print rotated array
        System.out.println(Arrays.toString(nums));
    }
}
