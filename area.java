import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area of circle: ");
        double area = sc.nextDouble();
        double radius = Math.sqrt((area)/Math.PI);
        double breadth = radius;
        double length = 2* radius;
        double areaOfRect = length * breadth ;
        System.out.println(areaOfRect);
        sc.close();
    }
}
