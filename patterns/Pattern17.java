/**
      A      
     ABA     
    ABCBA    
   ABCDCBA   
  ABCDEDCBA  
 ABCDEFEDCBA 

     A     
    ABA    
   ABCBA   
  ABCDCBA  
 ABCDEDCBA 

 */

public class Pattern17 {

    public static void main(String[] args) {
        int firstPrint = 6;
        patternPrint(firstPrint);

        int secondPrint = 5;
        patternPrint(secondPrint);
    }

    public static void patternPrint(int n) {

        // outer loop for the rows
        for (int i = 0; i < n; i++) {

            // 1st inner loop for the spaces
            for (int j = 0; j <= (n - i - 1); j++) {
                System.out.print(" ");
            }

            // 2nd Inner loop for the alphabets and

            char ch = 'A';

            int breakPoints = (2 * i + 1) / 2;

            for (int j = 1; j <= 2* i + 1; j++) {
                if (j <= breakPoints) {
                    System.out.print(ch++);
                } else {
                    System.out.print(ch--);
                }
            }

            // 3rd inner loop for the spaces
            for (int j = (n - i - 1); j >= 0; j--) {
                System.out.print(" ");
            }

            System.out.println();

        }
        System.out.println();
    }
}