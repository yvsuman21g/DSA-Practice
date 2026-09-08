/* Type of Inheritance - Single Level Inheritance 
1. single base class 
2. Single Derived class wll inherit the base class using extends keywords

*/

//base class -
class Shape {
    public void area() {
        System.out.println("Disaplay the area");
    }
}

class Tringle extends Shape {
    public void area(int l, int h){
        System.out.println("Are of Tringle is: "+0.5*l*h);
    }
}

public class singleLevel {
    public static void main(String args[]) {
        Tringle t = new Tringle();
        //  Shape class inherit
        t.area();
        // tringle class value
        t.area(10, 5);
    }
}
