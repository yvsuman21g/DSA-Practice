
import java.util.Scanner;
public class circumferenceOfCircle {

    public static void calumferenceOfCircle(int r){
        double radius = (2 * Math.PI * r);
        System.out.print("circumference Of Circle: "+radius);
        return;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the Circle: ");
        int rad = sc.nextInt();

        calumferenceOfCircle(rad);

        sc.close();
    }
}
