import java.util.Scanner;
public class insertionSort {

     public static void printInsertion(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
     }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");

        int size = sc.nextInt();
        // create an array 
        int arr[] = new int[size];

        System.out.println("Enter the values of the arrays: ");
        // input value of the arrays -
        for(int i=0; i <= arr.length-1; i++){
          arr[i] = sc.nextInt();
        }

        
        // Insertion sort -
        for(int i=0; i<= arr.length-1; i++){
            int j=i;
            while(j > 0 && arr[j-1] > arr[j]){
               int temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
                j--;
            }
        }
        printInsertion(arr);
        sc.close();
    }
}
