// 3 - Copy Constructor - 

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }

}

public class copyConst {
    public static void main(String args[]) {
        // Objects or Constructor -

        Student s1 = new Student();
        s1.name = "Ram";
        s1.age = 22;

        s1.printInfo();

        // Create another constructor -
        Student s2 = new Student(s1); // copy

    }
}
