import java.util.Scanner;

public class primeNumber {

    public static void printPrimeNumber(int num){

        boolean isPrime = true;

       if(num <= 1){
        System.out.println("This is not a Prime Number");
       }
       
    // Check the divisibility of sqaure root // 9 - sqaure root of 3 
       for(int i = 2; i <= Math.sqrt(num); i++){ 
        // or 
        // for(int i = 2; i < num; i++){ / best practice is above 1
            if(num % i == 0){
                isPrime = false;
                break;
            }
       }
       
       if (isPrime){
        System.out.println("This is a Prime Number");
       }
       else{
        System.out.print("This is not a Prime Number");
       }
       
      return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        printPrimeNumber(n);

    }
}
