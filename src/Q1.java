public class Q1 {
  static String prefix="Global:";
  private String name ="namescope";
  public static String getName(){
    return new Q1().name;
  }
  public static void main(String[] args) {
    Q1 q=new Q1();
    System.out.println(Q1.prefix+Q1.name);
    System.out.println(new Q1().prefix+new Q1().name);
    System.out.println(Q1.prefix+Q1.getName());
    System.out.println(prefix+name);
  }
}


// Which two options can you insert inside println method to produce Global:namescope? (Choose two.)
// Test.prefix+Test.name
// new Test().prefix+new Test().name
// Test.prefix+Test.getName()
// Test.getName+prefix
// prefix+Test.name
// prefix+name
// Answer: B C
