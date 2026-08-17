/*
Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur twice in the given array.

Input: arr[] = [3, 1, 2] 
Output: [] 
Explanation: There is no repeating element in the array, so the output is empty.

*/
import java.util.Scanner;
public class removeDup1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

//  enter the arrays elements
System.out.println("Enter the array elements");
        int[] arr = new int[n];
        
        for(int i=0; i< n; i++){
           arr[i] = sc.nextInt(); 
        }

        int result = remoDupli(arr, n);
        System.out.println("new array is: " + result);
         sc.close();
    }

    public static int remoDupli(int[] arr, int n){
        int x = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[x]){
                x = x + 1;
                arr[x] = arr[i];
                return arr[x];
            }
        }
        return x;
        
    }
   
}