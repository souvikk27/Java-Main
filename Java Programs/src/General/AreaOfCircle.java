package General;
import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14159;
        System.out.println("Enter the radius of circle ");
        double radius = in.nextDouble();
        
        double perimeter = 2 * pi * radius;
        double area = pi * radius * radius;
        System.out.println("The perimeter of the circle is " + perimeter);
        System.out.println("The area of the circle is " + area);
        
        in.close();

    }
}
