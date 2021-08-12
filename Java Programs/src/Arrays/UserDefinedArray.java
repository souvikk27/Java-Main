package Arrays;

import java.util.*;

public class UserDefinedArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        n = sc.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");  
            System.out.print("[");    
            for (int i=0; i<n; i++)   
            {  
                System.out.print(arr[i]);
                if(i < n-1)
                System.out.print(" , ");  
            } 
            System.out.print("]");
            sc.close();   
    }
}
