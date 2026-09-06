
public class setOp {
    public static void main(String args[]) {
        int pos = 1; // 0101
        int n = 5;

        int bitMask = 1 << pos;

        if ((bitMask | n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }

        int newNumber = bitMask | n;
        System.out.println("New Number is: "+newNumber);
    }
}
