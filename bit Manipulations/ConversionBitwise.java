import java.util.Scanner;

public class ConversionBitwise {
    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.append(n & 1);  // last bit
            n >>= 1;               // shift right
        }
        return binary.reverse().toString();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int pos = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += (1 << pos); // add 2^pos
            }
            pos++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int dec = sc.nextInt();
        System.out.println("Binary = " + decimalToBinary(dec));

        System.out.print("Enter binary number: ");
        String bin = sc.next();
        System.out.println("Decimal = " + binaryToDecimal(bin));

        sc.close();
    }
}
