/*
A School has following  rules for grading system:

a. Below 25 - F
b. 25 to 44 - E
c. 45 to 49 - D
d. 50 to 59 - C
e. 60 to 79 - B
f. 80 to 100 - A

Ask user to enter the marks and print the corrsponding grade.
*/

import java.util.Scanner;

public class ifElse {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if(marks < 25){
            System.out.println("Grade: F");
        }
        else if(marks >= 25 && marks <= 44){
           System.out.println("Grade: E"); 
        }
        else if(marks >= 45 && marks <= 49){
            System.out.println("Grade: D"); 
        }
        else if(marks >= 50 && marks <= 59){
            System.out.println("Grade: C"); 
        }
        else if(marks >= 60 && marks <= 79){
            System.out.println("Grade: B"); 
        }
        else {
            System.out.println("Grade: A"); 
        }
           sc.close();
    }
 
    
}
