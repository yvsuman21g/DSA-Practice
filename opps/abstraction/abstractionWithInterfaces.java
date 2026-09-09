/* 
Abstraction using interfaces -
*/
interface Animal {
    int eyes = 2; // properties will be public and fixes for all animals
    public void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("Horses walk with Four legs");
    }
}

public class abstractionWithInterfaces {
    public static void main(String args[]){
        Horse horse = new Horse();

        horse.walk();
    }
}