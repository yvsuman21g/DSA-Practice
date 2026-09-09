/* 
Types of Static Member in the Java -

Type 1 - Static Variable -
- It's known as the class Varible,
It shared among all the instances of the class
- We can call Static varibale using className without creating any constractor
*/

// static variable for all the students have common
class Student {
    String name;
    static String school;
}

// static methods which is common for all the students -




public class staticVariable {
    public static void main(String args[]){
        Student.school ="Alok Inter College";

        Student student1 = new Student();
        student1.name ="Madhav";
        System.out.println(student1.name+ " school name is: "+student1.school);
    }
}
