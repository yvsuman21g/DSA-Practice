/* Write a program to Count the 1's in binary representation of a number */

import java.util.Scanner;
public class countOf1 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number by user: ");
      int num = sc.nextInt();
      
      int count = 0;
      while(num > 0){
        if((num & 1) == 1){ // Check the last bit
           count++;
        }
        num = num >> 1; // right shift operations
      }
      System.out.print("Total number of Count of 1's is: "+count);
      sc.close();
    }
}
