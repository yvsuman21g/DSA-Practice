/*

* 
* *
* * *
* * * *
* * * * *

*/
import java.util.Scanner;;
public class Pattern2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int firstRow = 5;
        printPatterns(firstRow);

        int secondRow = 8;
        printPatterns(secondRow);

        sc.close();

    }

    public static void printPatterns(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(); // Print an empty line after each pattern
    }
}