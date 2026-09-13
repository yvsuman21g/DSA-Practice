// 3 - Copy Constructor - 

class CopyStudent {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    CopyStudent(CopyStudent s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    CopyStudent() {

    }

}

public class copyConst {
    public static void main(String args[]) {
        // Objects or Constructor -

        CopyStudent s1 = new CopyStudent();
        s1.name = "Ram";
        s1.age = 22;

        s1.printInfo();

        // Create another constructor 
        CopyStudent s2 = new CopyStudent(s1); // copy constructor
        s2.printInfo();

    }
}
