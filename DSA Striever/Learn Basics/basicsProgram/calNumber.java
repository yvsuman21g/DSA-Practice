import java.util.Scanner;
public class calNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number");
        int a = sc.nextInt();

        System.out.print("Enter the second number");
        int b = sc.nextInt();

        // Show Menu
        System.out.println("Choose operation");
        System.out.println("1: + (Addition)");
        System.out.println("2: + (Substraction)");
        System.out.println("3 + (Multiplication)");
        System.out.println("4 + (Division)");
        System.out.println("5 + (Modulo)");

        int choice = sc.nextInt();


        switch(choice){
            case 1: 
            System.out.println("Results: "+ (a + b));
            break;

            case 2: 
            System.out.println("Result: "+ (a - b));
            break;

            case 3: 
            System.out.println("Result: "+ (a * b));
            break;

            case 4: 
            if(b != 0){
            System.out.println("Result: "+ (a / b));
            } else {
                System.out.println("Error: Division by zero is not allowed");
            }
            break;

            case 5: 
            if(b != 0){
            System.out.println("Result: "+ (a % b));
            } else {
                System.out.println("Error: Modulo be zero is not allowed");
            }
            break;

            default:
                System.out.println("Invalid Operations");
                break;
        }
        sc.close();
        
    }
}
