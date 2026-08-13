// Import the ArrayList
import java.util.ArrayList;
import java.util.Collections;   
public class examArrayList {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        // method 1 - add the elements in the list

        list.add(1);
        list.add(2);
        list.add(5);

        System.out.println(list);

        // method 2 - get method to get the element from the arrayList

        int element = list.get(1);
        System.out.println(element);

        //method 3 - add el in between -

        list.add(0, 0);
        list.add(3,3);
        list.add(4,4);

        System.out.println(list);

        // method 4 - set element we can change the element

        list.set(0, 6);
        list.set(1, 10);
        list.set(2, 65);
        list.set(3, 12);
        list.set(4, 9);
        System.out.println(list);

        // method 5 - delete elements
        list.remove(3);
        System.out.println(list);

        // method 6 - size

        int size = list.size();
        System.out.println(size);

        // method 7 - loop 

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // method 8 - sorting
        Collections.sort(list);
        System.out.print(list);
    }
}
