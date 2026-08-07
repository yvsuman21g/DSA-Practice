public class secondSmallest {
    public static void main( String[] args) {
        secondSmallest sol = new secondSmallest();

         int[] num1 = { 1, 2, 3, 4, 5 };
        sol.secondSmallestNumber(num1);

        int[] num2 = { 3, 3, 0, 99, -40 };
        sol.secondSmallestNumber(num2);

        int[] nums3 = { -4, -3, 0, 1, -8 };
        sol.secondSmallestNumber(nums3);
    }

    public void secondSmallestNumber(int[] nums){

        int smallest = nums[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 1; i< nums.length; i++){
            if(nums[i] < smallest) {
                secondSmallest = smallest;
                smallest = nums[i];
            }

            else if(nums[i] != smallest && nums[i] < secondSmallest){
                secondSmallest = nums[i];
            }
        }
        System.out.println("Second smallest numbers are:" + secondSmallest);

    }
        
}


