class Pen {
    String color;
    String type; //ballPen or gelpen

    // inside the class oif we write a function is known as Method -
    public void write(){
        System.out.println("Write Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

public class opps {
    public static void main(String args[]){
        Pen pen1 = new Pen(); // object for Pen 1

        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();

        Pen pen2 = new Pen(); // Object for Pen 2
        pen2.color = "Red";
        pen2.type = "ballPoint";

        pen1.printColor();
        pen2.printColor();
    }
}
