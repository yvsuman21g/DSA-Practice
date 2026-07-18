/**

G F E D C B A 
F E D C B A 
E D C B A 
D C B A 
C B A 
B A 
A 

F E D C B A 
E D C B A 
D C B A 
C B A 
B A 
A 

 */

public class Pattern15 {

    public static void main(String[] args) {
        int firstPrint = 6;
        patternPrint(firstPrint);

        int secondPrint = 5;
        patternPrint(secondPrint);
    }

    public static void patternPrint(int n) {

        // outer loop for the rows
        for (int i = n; i >= 0; i--) {

            // 1st Inner loop for the Coulmns and connect with Rows
            for (char ch = (char)('A' + i); ch >='A';  ch--){
                System.out.print(ch + " ");
            }

            System.out.println();

        }
        System.out.println();
    }
}