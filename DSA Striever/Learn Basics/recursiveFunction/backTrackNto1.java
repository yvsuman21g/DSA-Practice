
import java.util.Scanner;
public class backTrackNto1 {

    static void backtrackNto1(int i, int num){
        if(i > num) return;

        backtrackNto1(i+1, num);
        System.out.print(i+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num value to start the number: ");
        int num = sc.nextInt();

        backtrackNto1(1, num);
        sc.close();
    }
}
