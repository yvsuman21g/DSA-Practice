import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subSequences {

    // Generates all subsequences using pick / do-not-pick recursion
    static void generateSubsequences(int index, int[] arr, List<Integer> current) {
        // Base Case: We have decided for all elements in the array
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Choice 1: INCLUDE the current element
        current.add(arr[index]);
        generateSubsequences(index + 1, arr, current);

        // Backtrack: Remove the added element before exploring Choice 2
        current.remove(current.size() - 1);

        // Choice 2: EXCLUDE the current element
        generateSubsequences(index + 1, arr, current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        generateSubsequences(0, arr, new ArrayList<>());

        sc.close();
    }
}