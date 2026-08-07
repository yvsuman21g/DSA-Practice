import java.util.Arrays;
public class zeroattheEnd {
    public static void main(String [] args){
        zeroattheEnd sol = new zeroattheEnd();

        int[] num1 = {1, 2, 0, 4, 3, 0, 5, 0};
        sol.movealltheZerosattheEndofArray(num1);
        System.out.println(Arrays.toString(num1));

        int[] num2 = {10, 20, 30};
        sol.movealltheZerosattheEndofArray(num2);
        System.out.println(Arrays.toString(num2));
    }

    public void movealltheZerosattheEndofArray(int[] nums){
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }

        for(; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
