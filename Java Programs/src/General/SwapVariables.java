package General;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two variables ");
        int a = in.nextInt();
        int b = in.nextInt();
        
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After SwapVariables ");
        System.out.println(a + " , " + b);
        in.close();
    }
}
