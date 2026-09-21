import java.util.Scanner;

public class backTrack1toN {

    static void backTack1toN(int i, int n){
        if( i < 1) return;

        backTack1toN(i-1, n);
        System.out.print(i+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of User input till you wanted to run linear 1 to N: ");
        int num = sc.nextInt();

        backTack1toN(num, num);
        sc.close();
    }
}
