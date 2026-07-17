/*
    *    
   ***
  *****
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *    
    
      *
     ***
    *****
   *******
  *********
 ***********
*************
*************
 *********** 
  *********  
   *******   
    *****    
     ***     
      *   

*/
import java.util.Scanner;
public class Pattern9 {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       int firstPrint =  4;
       patternPrint(firstPrint);

       int secondPrint = 6;
       patternPrint(secondPrint);

       sc.close();
    }

    public static void patternPrint(int n){

        //  above pyramid patterns

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

        // below reverse pyramid pattern
        for(int o = n-1; o >= 0; o--){

            // 1st Inner loop for Spaces
            for(int s =  n-o-1 ; s > 0; s--){
                System.out.print(" ");
            }

            // 2nd Inner loop for the Stars
            for(int p = 2*o+1; p > 0; p--){
                System.out.print("*");
            }

            //  3rd Inner loop for the Spaces
            for(int q = n-o-1; q > 0; q--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}