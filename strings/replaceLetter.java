import java.util.Scanner;

public class replaceLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the User String: ");
        String str = sc.next();
        String result = "";

        // create a String array

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }
        System.out.print("Output String where r replaced with i: "+result);
        sc.close();
    }
}
