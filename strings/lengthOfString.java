import java.util.Scanner;
public class lengthOfString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        //  Create an String array -
        String [] str = new String[size];

        int lengthCount = 0;

        for(int i=0; i < size; i++){
            str[i] = sc.next();
            lengthCount += str[i].length();
        }
        System.out.print("length of the Strinhg is: "+lengthCount);
        sc.close();
    }
}
