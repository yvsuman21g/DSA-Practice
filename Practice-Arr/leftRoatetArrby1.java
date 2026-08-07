import java.util.Arrays;

public class leftRoatetArrby1 {
  public static void main(String[] args) {
    leftRoatetArrby1 sol = new leftRoatetArrby1();
    int[] num1 = { 1, 2, 3, 4, 5 };
    sol.leftRotateArray(num1);

    int[] num2 = { 3, 3, 0, 99, -40 };
    sol.leftRotateArray(num2);

    int[] num3 = { -4, -3, 0, 1, -8 };
    sol.leftRotateArray(num3);

  }

  public void leftRotateArray(int[] nums) {
    int temp = nums[0];
    int n = nums.length;
    for (int i = 1; i < n; i++) {
      nums[i - 1] = nums[i];
    }
    nums[n - 1] = temp;
    System.out.println(Arrays.toString(nums));
  }

}
