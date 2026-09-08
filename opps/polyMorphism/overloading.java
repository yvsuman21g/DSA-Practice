/* polymorphism is java are two types - 
1. overloading is know as Compile-time polymorphism
2. Overriding is known as Run-time polymorphism

so below is Overloading - or Compile time polymorphism -
- means we can create different functions with differentk but the functions name should be same - is known as overloading
*/

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println("name is:c " + name);
    }

    public void printInfo(int age) {
        System.out.println("age is: " + age);
    }

    public void printInfo(String name, int age) {
        System.out.println("name is: " + name + " and age is: " + age);
    }
}

public class overloading {
    public static void main(String args[]) {
        Student s1 = new Student();

        s1.name = "Ram";
        s1.age = 21;

        s1.printInfo(s1.name, s1.age);

    }
}
