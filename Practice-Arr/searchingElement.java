import java.util.Scanner;

public class searchingElement {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows and columns: ");

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        // for inputs of an arrays -
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("find the elemnt of an array is: ");
        int x = sc.nextInt();

        // Find an elements -
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Position of the element in the array is: (" + i + ", " + j + ")");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
