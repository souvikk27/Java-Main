package Recursion;
import java.util.*;

public class Factorial {
    
    public static int factorial(int n) {
        // Write your code here
            if(n==1)
                return n;
                return n*factorial(n-1);
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial :");
        System.out.println(result);
        sc.close();
    }

}
