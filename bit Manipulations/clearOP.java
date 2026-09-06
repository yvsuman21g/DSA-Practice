/* Clear Bit -  clear the 3rd Bit (position 2) of a number (n = 0101)
step 1 - Bit-Mask: 1<<i
step 2 - AND With NOT

*/

public class clearOP {
    public static void main(String args[]) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        // Step 2 - perform the NOT Operations
        int notBitmask = ~bitMask;

        int newNumber = notBitmask & n;
        System.out.println("Result new Number is: " + newNumber);
    }
}
