import java.util.Scanner;
public class print1toN {
    public static void recursiveNumber(int num, int i){
        if(i > num) return;

        System.out.print(i+" ");
        recursiveNumber(num, i+1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number user wanted to print: ");
        int num = sc.nextInt();

        System.out.print("Enter the number from where user need to start the number: ");
        int i = sc.nextInt();

        recursiveNumber(num, i);

        sc.close();
    }
}
