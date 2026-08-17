/*
         1
       2 1 2
     3 2 1 2 3
   4 3 2 1 2 3 4
 5 4 3 2 1 2 3 4 5


*/

import java.util.Scanner;
public class palindromicPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User input number: ");
        int num = sc.nextInt();
        // Outer loop for the number of rows -
        for(int i = 1; i <= num; i++){
            
            // for the left side spaces
            for(int j = 1; j <= (num - i); j++){
                System.out.print(" ");
            }

            // for the left part of pattern
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }

            // for the right part of pattern
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }

            // for the right side space
             for(int j = 1; j <= (num - i); j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        sc.close();
    }
}
