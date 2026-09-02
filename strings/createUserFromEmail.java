// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

import java.util.Scanner;

public class createUserFromEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Input from the User: ");
        String str = sc.next();
        
        String username = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') {
                break;
            } else {
                username += str.charAt(i);
            }
        }
        System.out.print("Username is: " + username);
        sc.close();
    }
}
