package Arrays;
import java.util.*;

public class UserDefinedTwoDArray {
    public static void main(String[] args){	
        System.out.println("Enter rows in table: ");
        Scanner input = new Scanner(System.in);         
        int x = input.nextInt();       
        System.out.println("Enter column in table: ");  
        int y = input.nextInt();      
        int array[][]= new int[x][y];
        System.out.println("Enter array: ");     
        
        for(int row=0; row<x ;row++){
            for(int col = 0; col<y ; col++) {  
                array[row][col]=input.nextInt();
            
            }
        }  
        System.out.println("Array is : ");
        for(int row=0; row<x ;row++){
            for(int col = 0; col<y ; col++) {     
                System.out.print(array[row][col] + "\t");          
            }
            System.out.println();
            
        }
            
        input.close();
        
    }
    
}
