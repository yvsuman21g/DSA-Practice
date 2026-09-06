
public class basic {
    public static void main(String[] args) {

        // Create String builder
        StringBuilder sb = new StringBuilder("Radhey");

        // Method - 1 - Character at index 0
        System.out.println(sb.charAt(0));

        // method 2 - setCharAt index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb); // modified the 1st index character

        // Method 3 - insert - using this metyhod we can insert anything in the StringBuilder
        sb.insert(0, 'S');
        System.out.println(sb);

        /*
         * if we wanted to insert in the middle of the String then also we are able to
         * do using
         * this method
         */

        sb.insert(2, 'n');
        System.out.println(sb);

        // Method 4 - delete the extra character or subString \

        sb.delete(0, 1);
        System.out.println(sb);

        sb.delete(1, 2);
        System.out.println(sb);

        // method 5 -  append means we need to insert aything at the end -
        
        StringBuilder sb1 = new StringBuilder("H");
        sb1.append('e');
        sb1.append('l');
        sb1.append('l');
        sb1.append('o');
       System.out.println(sb1);

        // Method 6 - length method
        System.out.println(sb1.length());

    }

}
