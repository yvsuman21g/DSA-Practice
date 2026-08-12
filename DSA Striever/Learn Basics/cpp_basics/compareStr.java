import java.util.Scanner;

class compareStr {

    public boolean compareString(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // firstInput
        String str1 = sc.next();

        // 2nd Input
        Scanner newSc = new Scanner(System.in);
        String str2 = newSc.next();

        compareStr obj = new compareStr();

        if (obj.compareString(str1, str2)) {
            System.out.println("String are equal");
        } else {
            System.out.print("String are not equal");
        }

    }
}
