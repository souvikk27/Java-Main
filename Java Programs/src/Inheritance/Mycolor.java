package Inheritance;

class Mycolor{
    public void showColor(){
        System.out.println("My favorite color is Red.");
    }
  }
  class Yourcolor extends Mycolor{
    
    public void showColor() {
      System.out.println("I love the color Green. ");
  }
public void show(){
    showColor();
    super.showColor();
}
  }
  class TestColor{
    public static void main(String[] args) {
      Yourcolor y = new Yourcolor();
      y.show();
    }
  }