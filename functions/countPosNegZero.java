import java.util.Scanner;

public class countPosNegZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Total number of Inputs: ");
        int n = sc.nextInt();

        System.out.println("Enter the User Input Value: ");
        
        int input = 0;
        int countPos = 0, countNeg = 0, countZero = 0;
        for (int i = 0; i <n; i++) {

            input = sc.nextInt();
            if (input > 0) {
                countPos += 1;
            } else if (input < 0) {
                countNeg += 1;
            } else {
                countZero += 1;
            }
        }
        System.out.println("Count of Positive: " + countPos);
        System.out.println("Count of Negative: " + countNeg);
        System.out.println("Count of Zero: " + countZero);
        sc.close();
    }
}
