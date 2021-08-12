package Arrays;

import java.util.*;

public class ArrayReverse {
    static void reverse(int a[], int x)
    {
        System.out.println("Reversed array is: \n");
        for (int k = x-1; k >= 0; k--) {
            System.out.print(a[k] + " ");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            reverse(arr, n);
        sc.close();   
    }
    
}
