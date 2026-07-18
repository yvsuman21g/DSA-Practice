/**
 
A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 

A 
B B 
C C C 
D D D D 
E E E E E 

 */

public class Pattern16 {

    public static void main(String[] args) {
        int firstPrint = 6;
        patternPrint(firstPrint);

        int secondPrint = 5;
        patternPrint(secondPrint);
    }

    public static void patternPrint(int n) {

        char alphabet = 'A';

        // outer loop for the rows
        for (int i = 0; i < n; i++) {

            // 1st Inner loop for the Coulmns and connect with Rows
            for (char j = 0; j <= i; j++) {
                System.out.print(alphabet + " ");
                
            }
            alphabet = (char) (alphabet + 1);

            System.out.println();

        }
        System.out.println();
    }
}