 abstract class A{
  abstract void b();
}
public class Q8 extends A{
  
  void b(){
    System.out.println(4);
  }
  public static void main(String[] args) {
    A a= new Q8();
    a.b();
  }
}