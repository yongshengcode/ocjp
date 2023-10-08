 abstract class Q8A{
  abstract void b();
}
public class Q8 extends Q8A{
  
  void b(){
    System.out.println(4);
  }
  public static void main(String[] args) {
    Q8A a= new Q8();
    a.b();
  }
}