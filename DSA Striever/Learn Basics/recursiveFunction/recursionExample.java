
public class recursionExample {

    static int printNumber(int counter) {
        System.out.println(counter);
        printNumber(counter);
        return 1;
    }

    public static void main(String args[]) {
        printNumber(1);

    }
}
