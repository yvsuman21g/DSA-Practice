/*
     1
    2 2 
   3 3 3 
 4 4 4 4
5 5 5 5 5

*/
import java.util.Scanner;
public class number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the user input :");
        int num = sc.nextInt();

        //  row
        for(int i = 1; i <= num; i++){
           
            // spaces
            for(int j = 1; j <= (num-i); j++){
                System.out.print(" ");
            }

            // print the numbers based on the row
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }

            // for the again spaces
              for(int j = 1; j <= (num-i); j++){
                System.out.print(" ");
            }
            System.out.println("");

        } 
        sc.close();
    }
}
