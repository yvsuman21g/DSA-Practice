import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class hasingEx {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // creation of HashSet =
        HashSet<Integer> set = new HashSet<>();
        
        // insert element in the HashSet using add method -
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // list.add

        //  size
        System.out.println("Size of set is: "+set.size());

        // print all the elements of set 
        System.out.println(set);

        // Search 
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Does not contains 6");
        }

        // delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Does not contains 1");
        }

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        sc.close();
    }
}
