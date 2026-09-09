
/* Types of Static Member in the Java -

Type 3 - Static Method -
- Static methods belongs to the class rather than any objects -
 - can access only the statuic data directly\
 - Can not access instances, variable or methods directly
 - Can not use this or super keyword
*/

class Animal {

    // static variable
    static int eyes = 2;
    static int legs = 4;
    static int a = m1();

    // static block
    static {
        System.out.println("This is Static Block");
    }

    // static Methods -
    static int m1() {
        System.out.println("This is Static Method");
        return 50;
    }

}

public class staticMethod {
    public static void main(String args[]) {
        System.out.println("Value of variable a is: " + Animal.a);
    }
}
