/* Get Bit Opeartions -  Get the 3rd Bit (position 2) of a number (n = 0101)
step 1 - Bit-Mask: 1<<i
step 2 - AND

*/

public class getOp {
    public static void main(String [] args){
        int n = 5; //0101
        int pos = 2;

        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }

        int newNumber = bitMask & n;
        System.out.print("New number is: "+newNumber);
    }
}
