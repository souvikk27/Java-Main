package General;
import java.util.*;

public class BinaryArithmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b1 , b2;
        int i1 , i2;
        System.out.println("Enter first binary number : ");
        b1 = sc.next();
        System.out.println("Enter second binary number : ");
        b2 = sc.next();
        i1 = Integer.parseInt(b1 , 2);
        i2 = Integer.parseInt(b2 , 2);
        System.out.println("Sum = " + Integer.toBinaryString(i1 + i2));
        System.out.println("Difference = " + Integer.toBinaryString(i1 - i2));
        System.out.println("Product = " + Integer.toBinaryString(i1 * i2));
        System.out.println("Quotient = " + Integer.toBinaryString(i1 / i2));
        sc.close();
    }
}
