import java.util.Scanner;
public class hollowTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n: ");

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // space -
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i-1); j++){

                if(j==1 || j== (2*i-1) || i==1 || i==n){
                      System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             
            
            System.out.println();
        }
        sc.close();
    }
}
