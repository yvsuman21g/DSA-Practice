class Students {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class opps2 {
    public static void main(String args[]){
        // create an Objects
        Students st1 = new Students();

        st1.name = "Ram";
        st1.age = 21;

        st1.printInfo();
    }
}
