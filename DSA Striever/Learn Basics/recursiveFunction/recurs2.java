

public class recurs2 {

    static void recursive(int count){
        if(count == 3) return; //  Base condition with recursion
        
        System.out.print(count);
       recursive(count + 1);
        
    }
    public static void main(String args[]){
        recursive(0);
    }
}
