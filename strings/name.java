import java.util.Scanner;
public class name {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the input from the users: ");
        String person = sc.nextLine();

        System.out.println("User name is: "+person);
        sc.close();
    }
}