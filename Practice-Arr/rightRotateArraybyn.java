import java.util.Arrays;

public class rightRotateArraybyn {
    public static void main(String[] args) {
        rightRotateArraybyn sol = new rightRotateArraybyn();

        int[] num1 = { 1, 2, 3, 4, 5, 6, 7 };
        sol.rotatebyN(num1, 3);

        int[] num2 = { -1, -100, 3, 99 };
        sol.rotatebyN(num2, 2);

    }

    public void rotatebyN(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];

        // step 1 take the right side of element and insert in the temp array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // step 2 shift the postions of array
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // step 3 - for adding the temp array
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        System.out.println(Arrays.toString(nums));
    }

}
