import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class subSequences {

    static void subSequenceRecusiveFn(int index, int arr[], int n, List<Integer> sequence){
        if(index >= n) {
            for (int value : sequence) {
                System.out.print(value + " ");
            }
            System.out.println(sequence);
            return;
        }

        sequence.add(arr[index]);
        subSequenceRecusiveFn(index + 1, arr, n, sequence);
        sequence.remove(sequence.size() - 1);
        subSequenceRecusiveFn(index + 1, arr, n, sequence);
    }
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // create4 an array -
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        subSequenceRecusiveFn(0, arr, arr.length, new ArrayList<>());
        sc.close();
    }
}
