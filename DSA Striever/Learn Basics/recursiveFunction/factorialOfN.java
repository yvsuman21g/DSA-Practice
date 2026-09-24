import java.util.Scanner;
public class factorialOfN {

    static int factOfN(int n){
        if(n==0) return 1;
        return n * factOfN(n-1);
    }

        
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of User n: ");

        int num = sc.nextInt();
        System.out.print(factOfN(num));
        sc.close();

    }
}
