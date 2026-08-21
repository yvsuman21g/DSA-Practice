
import java.util.Scanner;
public class nullValue {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // array need to create 
        int numbers[] = new int[size];

        for(int i = 0; i<size; i++){
            System.out.println(numbers[i]); // in the java if we will not assign any values to the arrays then it'll automaticaly null based on the dataTypes
        }
        sc.close();
    }
}
