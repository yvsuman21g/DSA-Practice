import java.util.Scanner;

public class eligibleForVote {

    public static void calAgeforVote(int age) {
        if (age > 18) {
            System.out.print(age + ": eligible for Vote");
        } else {
            System.out.print(age + " : is not eligibale for Vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of the Person: ");
        int age = sc.nextInt();
        calAgeforVote(age);

        sc.close();
    }
}
