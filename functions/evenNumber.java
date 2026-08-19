import java.util.Scanner;
public class evenNumber {

    public static void evenorNot(int num){
        if(num % 2 == 0){
            System.out.print("This is a even number");
        }
        else {
            System.out.println("This is not a even number");
        }
    }

   public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User input: ");
        int n = sc.nextInt();

        evenorNot(n);
        
        sc.close();
   } 
}
