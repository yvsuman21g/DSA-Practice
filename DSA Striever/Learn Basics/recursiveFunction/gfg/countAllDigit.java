import java.util.Scanner;
class countAllDigit {

    static void countDigit(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count = count + 1;
        }
        System.out.print(count);
    }
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5, 6};
        countDigit(arr);
    }
}