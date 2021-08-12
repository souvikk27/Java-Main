package DS.Arrays;
//Java program to find the maximum difference between two array elements.

import java.util.*;
class Difference {
  	private int[] elements;
  	public int maximumDifference;
      
  public Difference(int[] a){ 
        this.elements=a;
    }
        public void computeDifference(){
                int n=elements.length;
                int min=100;
                int max=1;

                for(int i=0;i<n;++i)
                {
                    if(elements[i]<min){
                        min=elements[i];
                        }
                    if(elements[i]>max){
                        max=elements[i];
                        }
                }
                maximumDifference=max-min;
        }
} 

public class FindMaxDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array ");
        int n = sc.nextInt();
        System.out.println("Enter array elements ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Maximum difference between array elements ");
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}
