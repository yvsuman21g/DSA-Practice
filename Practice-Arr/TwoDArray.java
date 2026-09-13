import java.util.Scanner;
public class TwoDArray {
    public static void main(String args[]){
        // create 2D array
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the arrys rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        System.out.println("Enter the Input values for rows and columns: ");
        
        int arrs [][] = new int[rows][cols];

        // inputs array -
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arrs[i][j] = sc.nextInt();
            }
        }

        // output arrays -
        System.out.println("Output of the arrays is: ");
         for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
               System.out.print(arrs[j][i]+" ");
            }
            System.out.println();   
        }
        sc.close();
    }
}
