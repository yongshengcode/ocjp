public class Q33 {
  
}
abstract class Animal{
  protected abstract void walk();
}
abstract class Human1 extends Animal{
  protected void walk(){}
}
abstract class Human2 extends Animal{
   void walk(){}
}
abstract class Human3 extends Animal{
   public void walk(){};
}