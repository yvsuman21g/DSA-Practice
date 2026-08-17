import java.util.Scanner;
class areaOfCircle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Radius of Circle is: "+ radius);
        System.out.println("Area of Circle is: "+ area);
        sc.close();
    }
}