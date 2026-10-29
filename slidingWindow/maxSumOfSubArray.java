import java.util.Scanner;
public class maxSumOfSubArray {

    static int calMaxSum(int arr[], int k){
        int n = arr.length;

        if(k<=0 || k>n){
            System.out.println("Invalid value of K: ");
        }

        int sum = 0;
        int maxSum = 0;
        int left = 0;
        int right = k;

        // calculate the first sum
        for(int i=0; i<k; i++){
            sum+= arr[i];
        }

        while( right < n) {
            sum-= arr[left];
            left++;
            sum+= arr[right];
            right++;
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;

        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array input values: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the K value: ");
        int k = sc.nextInt();

        System.out.println("Max Value is: "+calMaxSum(arr,k));
        sc.close();
    }
}
