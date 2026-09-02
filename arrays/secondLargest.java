import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array input size: ");
        int size = sc.nextInt();

        // array cration -
        int numbers[] = new int[size];

        // Input array loop
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int larg = numbers[0];
        int sLarg = 0;

        // for loop -
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] > larg) {
                sLarg = larg;
                larg = numbers[i];
            }
        }
        System.out.println("Array Largest Number is: "+larg);
        System.out.print("Array Second Largest Number is: "+sLarg);
        sc.close();
    }
}
