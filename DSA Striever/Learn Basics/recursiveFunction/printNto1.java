import java.util.Scanner;
public class printNto1 {

    static void recursiveNto1(int i, int num) {
        if(i < 1) return;

        System.out.print(i+" ");

        recursiveNto1(i-1, num);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the User input for number which is start from: ");
        int num = sc.nextInt();

        recursiveNto1(num, num);
        sc.close();
    }
}
