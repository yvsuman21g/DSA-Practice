public class secondLargest {

    public static void main(String[] args) {
        secondLargest sol = new secondLargest();

        int[] num1 = { 1, 2, 3, 4, 5 };
        sol.secondLargestElement(num1);

        int[] num2 = { 3, 3, 0, 99, -40 };
        sol.secondLargestElement(num2);

        int[] nums3 = { -4, -3, 0, 1, -8 };
        sol.secondLargestElement(nums3);

    }

    public void secondLargestElement(int[] nums) {
        int largest = nums[0];

        int sLargest = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                sLargest = largest;
                largest = nums[i];
            }

            else if (nums[i] < largest && nums[i] > sLargest) {
                sLargest = nums[i];
            }
        }
        System.out.println("Second largest element is: " + sLargest);
    }

}
