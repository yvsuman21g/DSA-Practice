/* Types of Static Member in the Java -

Type 2 - Static Block -
- Execute only once when the class is first loaded into the memory
*/

class Calculation {
    static int a = 10;
    static int b;

    // static block
    static {
        System.out.println("Static block initialized");
        b = a * 10;
    }
}

public class staticBlock {
    public static void main(String args[]) {
        System.out.println("From main");
        System.out.println("Variable a is: "+Calculation.a);
        System.out.println("Varibale b is: "+Calculation.b);
    }
}
