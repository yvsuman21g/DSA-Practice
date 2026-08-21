import java.util.Scanner;

public class findMaxMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array of the inout Size: ");

        int size = sc.nextInt();

        // array created
        int number[] = new int[size];

        // Input of the Array
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int min = number[0];
        int max = number[1];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
                
            } else if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("Max number of an array is: " + max);
        System.out.println("Min number of an array is: " + min);
        sc.close();
    }

}