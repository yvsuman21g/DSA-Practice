import java.util.Scanner;
public class searchArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User inputs size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input of the arrays
        System.out.println("Enter the arrays elements by User: "); 
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Plase enter a number you wantto know index: ");
        int x = sc.nextInt();
        // output loop
        for(int i=0; i<numbers.length; i++){
            if(x == numbers[i]){
                System.out.print("X found at index: "+i);
            }
        }
        sc.close();
    }
}

