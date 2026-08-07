public class LargestEl {

    public static void main(String[] args) {
        LargestEl solution = new LargestEl();

        int[] num1 = {1, 2, 3, 4, 5};
        solution.largestElement(num1);

        int[] num2 = {3, 3, 0, 99, -40};
        solution.largestElement(num2);

        int[] nums3 = {-4, -3, 0, 1, -8};
        solution.largestElement(nums3);
    }

    public void largestElement(int[] nums) {
        int largestElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largestElement) {
                largestElement = nums[i];
            }
        }
        System.out.println("The largest element in the array is: " + largestElement);
    }
}
