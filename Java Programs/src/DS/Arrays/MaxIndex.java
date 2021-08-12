package DS.Arrays;

import java.util.*;

public class MaxIndex {
    static int maxIndexDiff(int arr[], int n) { 
        // Your code here
        int diff = Integer.MIN_VALUE;
        n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = n - 1; j > i; j--){
                if (arr[j] > arr[i] && diff < j - i) {
                    diff = j - i;
                }
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int x = sc.nextInt();
        int[] array = new int[x];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < x; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Maximum index of the array is : ");
        int max = maxIndexDiff(array, x);
        System.out.println(max);
        
        sc.close();
    }
}
