import java.util.Scanner;

public class primeNumber {

     static boolean isPrime(int n){
        if(n <=1){
            return false;
        }
        for(int i=2; i<=n; i++){
           if(n / i == 0){
            return false;
           }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the User input: ");
        int num = sc.nextInt();

       if(isPrime(num)){
        System.out.print("true");
       }
       else {
        System.out.print("false");
       }
        sc.close();
    }
}
