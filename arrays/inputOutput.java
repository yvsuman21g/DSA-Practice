
import java.util.Scanner;
public class inputOutput {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // array need to create 
        int numbers[] = new int[size];


        // input loop -
        System.out.println("Enter the inputs of the Users: ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        // output loop - 
        System.out.println("Enter the outputs of the Users are: ");
        for(int i = 0; i<size; i++){
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
