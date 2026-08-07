public class removeDuplicate {
    public static void main(String[] args) {
        removeDuplicate sol = new removeDuplicate();
        int[] num1 = { 1, 2, 3, 4, 5 };
        sol.removeDuplicateNumbers(num1);

        int[] num2 = { 3, 3, 0, 99, -40 };
        sol.removeDuplicateNumbers(num2);

        int[] num3 = { -4, -3, 0, 1, -8 };
        sol.removeDuplicateNumbers(num3);

    }

    public void removeDuplicateNumbers(int[] nums) {
        int i  = 0;

        for(int j = 1; j <nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i + 1] = nums[j];
                i++;
            }

        }
        for(int k = 0; k<=i; k++){
            System.out.print(nums[k] + " ");
        }
        System.out.println();
    }
}
