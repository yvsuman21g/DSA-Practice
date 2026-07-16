/*
     *    
   ***
  *****
 ******* 
*********
      *
     ***
    *****
   *******
  *********
 ***********
*************


*/
import java.util.Scanner;
public class Pattern8 {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       int firstPrint =  5;
       patternPrint(firstPrint);

       int secondPrint = 7;
       patternPrint(secondPrint);

       sc.close();
    }

    public static void patternPrint(int n){

        //  Outer Row loop

        for(int i = n; i >= 0; i--){
            // 1st Inner loop for Spaces
            for(int j =  n-i-1 ; j > 0; j--){
                System.out.print(" ");
            }

            // 2nd Inner loop for the Stars
            for(int k = 2*i+1; k > 0; k--){
                System.out.print("*");
            }

            //  3rd Inner loop for the Spaces
            for(int m = n-i-1; m > 0; m--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}