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
public class Pattern7 {

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

        for(int i = 0; i < n; i++){
            // 1st Inner loop for Spaces
            for(int j = 0 ; j < n-i-1; j++){
                System.out.print(" ");
            }

            // 2nd Inner loop for the Stars
            for(int k = 0; k < 2*i+1; k++){
                System.out.print("*");
            }

            //  3rd Inner loop for the Spaces
            for(int m = 0 ; m < n-i-1; m++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}