package EPI.HackerRank;

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
} // End of Difference class

public class DayFourteenthThirty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
