import java.util.Scanner;   
import java.util.Objects;

public class polindromeString {
    public static boolean palindromRecursiveStr(String arr[], int i) {

        if ( i >= arr.length / 2) return true;
    
        if (!Objects.equals(arr[i], arr[arr.length - i - 1])) return false;
    
        return palindromRecursiveStr(arr, i + 1);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline after the size.

        // create an array -
        String arr[] = new String[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }

       boolean result = palindromRecursiveStr(arr, 0);
        System.out.println(result? "Polindrome" : "Not a Polindrome");
        sc.close();

    }
}