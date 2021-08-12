package Inheritance;

public class Myclass1 {
    
    Myclass1() {
        System.out.println("Calling base class constructor... ");
    }
    Myclass1(int x){
        System.out.println(x);
    }
}
class Myclass2 extends Myclass1 {
    
    Myclass2() {
        super(5);
        System.out.println("Calling derived class");
    }
    Myclass2(int y){
        super();
        System.out.println(y);
        
}


}
class TestClass{
    public static void main(String[] args) {
        Myclass2 m = new Myclass2();
        Myclass2 n = new Myclass2(28);
    }
}