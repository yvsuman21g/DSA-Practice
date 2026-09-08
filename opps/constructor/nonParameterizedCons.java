// 1- Non parameterized constructor - 

class Student {
    String name;
    int age;

    public void stInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    // Create non Parameterized constructor -
    Student(){
        System.out.println("Constrctor called");
    }

}

public class nonParameterizedCons {
    public static void main(String args[]){
        // create Objects - then constructor will created by java by Default -
        Student s1 = new Student(); // constructor

        s1.name = "Radha";
        s1.age = 17;
    
        s1.stInfo();
        
    }
}
