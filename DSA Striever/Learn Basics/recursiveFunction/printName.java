import java.util.Scanner;

public class printName {

    static void recursiveFn(int i, int num){
        if(i > num) return;
        System.out.println("Radha");
        recursiveFn(i+1, num);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number user wanted to print the name: ");
        int num = sc.nextInt();

        System.out.print("Enter the value user wanted to start from 0 or 1 if i: ");
        int i = sc.nextInt();

        recursiveFn(i, num);

        sc.close();
    }
}
