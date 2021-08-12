package EPI.HackerRank;


import java.util.*;

public class Two_D_Arrays {
    static int hourGlassSum(int[][] arr){
        int rows = arr.length;
        int columns = arr[0].length;
        int max_hourglass_sum = Integer.MIN_VALUE;
        for(int i=0; i<rows-2; i++) {
            for(int j=0; j<columns-2; j++){
                int current_hourglass_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
               max_hourglass_sum = Math.max(max_hourglass_sum, current_hourglass_sum); 
            }
        }
        return max_hourglass_sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rowSize = 6;
        int colSize = 6;
        int[][] x = new int[rowSize][colSize];
                for(int i=0; i<rowSize;i++)
                    {            
                        for(int j=0; j<colSize;j++)
                        {
                            x[i][j]=sc.nextInt();
                        }
                    }
        int sum = hourGlassSum(x);
        System.out.println(sum);
        sc.close();
        
    }
}
