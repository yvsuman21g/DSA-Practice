/* 
    a * b / a - b; if a= 10 and b = 5

*/

import java.util.Scanner;
public class mathCal {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int result = (a * b) / (a - b);
    System.out.println(result);
    sc.close();
  } 
}
