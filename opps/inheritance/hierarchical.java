/* Type of Inheritance - Hierarchical Inheritance 
1. single base class 
2. more than 1 derived class 
3. Each dervied class inherit the same base class
*/

class Shape {
    public void area(){
        System.out.println("Displa the area");
    }
}

class Tringle extends Shape {
    public void area(int l, int h){
        System.out.println("Tringle area is: "+0.5*l*h);
    }
}

class Circle extends Shape {
    public void area(int r){
      System.out.println("Circle area is: "+((3.14)*r*r));
    }
}
public class hierarchical {
    public static void main(String args[]){
        Tringle t = new Tringle();
        
        // shape base class
        t.area();

        // Tringle 
        t.area(10, 10);

        // Circle
        Circle c = new Circle();
        c.area(2);
    }
}
