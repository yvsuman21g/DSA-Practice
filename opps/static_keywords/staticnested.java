
/* Types of Static Member in the Java -

Type 4 - Static Nested -
- Static nesated declare inside the another static class 
- Inner class access based on the outer class
*/

class Outer {
    static class Inner {
        void shows() {
            System.out.println("Static Nested class Method");
        }
    }
}

public class staticnested {
    public static void main(String args[]) {
        Outer.Inner obj = new Outer.Inner();

        obj.shows();
    }
}
