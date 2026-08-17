/*
Hollow Butterfly

*/
import java.util.Scanner;
public class hollowButterfly {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");

        int n = sc.nextInt();
        // Upper wings -

        for(int i=1; i<=n; i++){

            // left side of wings
            for(int j=1; j<=i; j++){
                if(j == 1 || j == i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            // Spaces between wings
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }   

            // right side of wings
            for(int j=1; j<=i; j++){
                if(j == 1 || j == i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        // Lower wings -
        for(int i=n; i>=1; i--){

            // left side of wings
            for(int j=1; j<=i; j++){
                if(j == 1 || j == i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            // Spaces between wings
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // right side of wings
            for(int j=1; j<=i; j++){
                if(j == 1 || j == i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
