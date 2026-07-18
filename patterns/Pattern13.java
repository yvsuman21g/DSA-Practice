/**

A 
B C 
D E F 
G H I J 
K L M N O 
P Q R S T U 

A 
B C 
D E F 
G H I J 
11 12 13 14 15 

 */

public class Pattern13 {

    public static void main(String[] args) {
        int firstPrint = 6;
        patternPrint(firstPrint);

        int secondPrint = 5;
        patternPrint(secondPrint);
    }

    public static void patternPrint(int n) {

        int number = 1;

        // outer loop for the rows
        for (int i = 1; i <= n; i++) {

            // 1st Inner loop for the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();

        }
        System.out.println();
    }
}