package Functions;

public class TeenNumberChecker {
    public static boolean hasTeen(int x, int y, int z) {
    if((13<=x && x<=19) || (13<=y && y<=19) || (13<=z && z<=19)){

        return true;
    }
      return false;
    }
public static boolean isTeen(int v){
    if(v<=13 && v<=19){
        return true;
    }
    return false;
}
}


