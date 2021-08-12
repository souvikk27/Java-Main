package General;
import java.util.*;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal, reminder;
        String hexadecimal = " ";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        System.out.println("Enter a decimal number ");
        decimal = sc.nextInt();

        while (decimal > 0) {
            reminder = decimal % 16;
            hexadecimal = hex[reminder] + hexadecimal;
            decimal = decimal / 16;
        }
        System.out.println("The hex value is " +hexadecimal);
        sc.close();
    }
}
