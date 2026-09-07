/* Write a program to calculate the number is pow of 2 or not */

import java.util.Scanner;

public class powerOf2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User Input Number: ");
        int num = sc.nextInt();

        if ((num > 0) && ((num & (num - 1)) == 0)) {
            System.out.println(num+ ": is the pow of 2");
        }
        else{
          System.out.println("number is not pow of 2");
        }
        sc.close();
    }

}
