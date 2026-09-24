
import java.util.Scanner;
public class example2 {

    static void fun(int n){
        if(n==0) return;

        fun(n-1);
        System.out.println(n);
        fun(n-1);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user Input: ");
        int num = sc.nextInt();
        fun(num); // input 3 
        sc.close();
    }
}
