import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array input size: ");
        int size = sc.nextInt();

        // create an 1D arrays -
        System.out.println("Enter the 1D array inputs: ");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int newArr[] = new int[size + 1];
        // old array value shifted into the new Arrays -
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.println("Enter the User X input to add in the array: ");
        int x = sc.nextInt();
        newArr[size] = x;
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
        }
        sc.close();
    }

}
