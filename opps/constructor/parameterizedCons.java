// 2 -  Parameterized constructor -
class Student {
    String name;
    int age;

    Student(String name, int age){
     this.name = name;
     this.age = age;
     System.out.println("Student name is: "+name+ " and age is: "+age);
    }
}
public class parameterizedCons {
    public static void main(String args[]){
        Student s1 = new Student("Krishna", 18);
    }
}
 