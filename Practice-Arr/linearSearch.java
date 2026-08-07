public class linearSearch {
    public static void main(String args[]){
        linearSearch sol = new linearSearch();

        int target = 4;

        int[] num1 = {6, 7, 8, 4, 1};
        sol.linearSearchInArray(num1, target);

        target = 5;
        int[] num2 = {4, 2, 9, 7, 5};
        sol.linearSearchInArray(num2, target);
    }

    public void linearSearchInArray(int[] nums, int k){
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == k){
             System.out.println(i);
             return;
            }
        }
    }
        
}
