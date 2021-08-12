package Functions;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        
        if((int)(one*1000) == (int)(two*1000)){
            System.out.println("True ");
            return true;
         } else{
            System.out.println("False ");
            return false;
         }
        
    }
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.0, 3.0);
    }
}
