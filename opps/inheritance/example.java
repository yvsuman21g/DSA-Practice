class Parent {
    String name;
    String address;
}

class Sudent extends Parent{
    void printAddress() {
        System.out.println("Student address is: " + address);
    }
}

public class example {
    public static void main(String args[]){

        Parent p1 = new Parent();
        p1.name = "Shyam";
        p1.address = "123 Block C, near HaldiRam sweets";

    }
}
