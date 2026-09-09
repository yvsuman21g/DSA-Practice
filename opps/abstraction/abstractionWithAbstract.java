
/* Abruction must have declare with abstract keywords
- iT can have abstract and Non abstract keyword
- it can have constractor and static methods also */
abstract class Animal{
    abstract void walk();

    public void eat(){
        System.out.println("Horse can eat grass");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Walk on Two legs");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walk on Four legs");
    }
}

public class abstractionWithAbstract {
    public static void main(String args[]){
        Horse horse = new Horse();

        horse.walk();
        horse.eat();
    }
}
