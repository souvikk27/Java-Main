package Functions;

public class EqualSumChecker {
    public static boolean hasEqualSum(int x, int y, int z) {
        if((x+y) == z){
            System.out.println("True");
            return true;
        }else{
            System.out.println("False");
            return false;
        }
    }
public static void main(String[] args) {
    hasEqualSum(-3,2,5);
}
}

