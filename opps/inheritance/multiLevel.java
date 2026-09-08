/* Type of Inheritance - Multi Level Inheritance 
1. single base class 
2. 2 Derived class wll inherit 
3. First Derived class iherit the Base class
4. end Derived class inherit the 1st derived class

*/
// base class
class Shape {
    public void area(){
        System.out.println("Display the area");
    }
}

// 1st derived class extends the base class 
class Tringle extends Shape {
    public void area(int l, int h){
        System.out.println("Tringle area is: "+0.5*l*h);
    }
}

//2nd derived class extends the 1st derived class 
class EquilateralTringle extends Tringle {
    public void area(int l, int h){
        System.out.println("Equilateral Tringle area is: "+0.5*l*h);
    }
}

public class multiLevel {
    public static void main(String args[]){
        Tringle s = new Tringle();

        // base 
        s.area();

        // 1st derived 
        s.area(10, 5);

        // 2nd derived
        s.area(10, 10);
    }
}
