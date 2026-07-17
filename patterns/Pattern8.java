/*

***********
*********
 ******* 
  *****  
   ***   
    *    
***************
*************
 *********** 
  *********  
   *******   
    *****    
     ***     
      *   
      * 

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
            for(int s =  n-i-1 ; s > 0; s--){
                System.out.print(" ");
            }

            // 2nd Inner loop for the Stars
            for(int p = 2*i+1; p > 0; p--){
                System.out.print("*");
            }

            //  3rd Inner loop for the Spaces
            for(int q = n-i-1; q > 0; q--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}