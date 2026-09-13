// 2 -  Parameterized constructor -
class ParameterizedStudent {
    private String name;
    private int age;

    public ParameterizedStudent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student name is: " + this.name + " and age is: " + this.age);
    }
}
public class parameterizedCons {
    public static void main(String args[]){
        new ParameterizedStudent("Krishna", 18);
    }
}