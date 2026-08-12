public class funExam {

    //  void function doesn't return anything -
    //  paramaterized function can take parameter
    
     public static void main(String[] args){

        String name = "Aman";
        String name2  = "Suman";

       printName(name);
       printName(name2);

    }
    //  we are passing name as a parameter so it's called parameterized function
    public static void printName(String name){
        System.out.println(name);
    }
}
