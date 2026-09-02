
public class stringMethods {
    public static void main(String [] args){

        // Method 1 - concatenation + 

        String firstName = "Tony";
        String lastName = "Stark";

        String fullName = firstName+ "@" + lastName;
        System.out.println(fullName);

        //  Method 2 - length method -
        System.out.println(fullName.length());

        // //  Method 3 - CharAt() -
        // for(int i=0; i<=fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }

        //  Method 4 - .compareTo() -
        String name1 = "Hello";
        String name2 = "Hello"; 

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }

        /*  why need .compareTo() if we have == (double equalTo method) - because in the java Strings are non preemptive data
        types and in the memory it's stored as an objects - and some cases are failing doube equal to
        */

        if(new String("Suman") == new String("Suman")){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal"); // here it's printing as wronmg and failed test case
        }

        // Method 5 - subString() -
        String sentence = "My name is Tony";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name); // Tony

        String name3 = sentence.substring(11, 14);
        System.out.println(name3); // Ton

         // if we are not passing any end value so it's taking byDefault end whole value
          String name4 = sentence.substring(3);
          System.out.println(name4); // name is Tony

        //   Method 6 - Integer.parseInt()- That will convert String into the integer - Method of Integer Class
            String str = "123456";
            int number = Integer.parseInt(str);
            System.out.println(number);

        // Merthod 7 - Integer.toString() - That'll convert Integer into the String - Methiod of String class
            int num = 12345;
            String strN = Integer.toString(num);
            System.out.println(strN.length());


    }
}
