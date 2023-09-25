public class Q43 {
  private final double value;
  public Q43(String value){
    this(Double.parseDouble(value));
  }
  public Q43(double value){
    this.value=value;
  }
  public Q43(){}
  public double getValue(){return value;}
  public static void main(String[] args) {
    Q43 q1 = new Q43("1.99");
    Q43 q2 = new Q43(2.99);
    Q43 q3 = new Q43();
    System.out.println(q1.getValue());
    System.out.println(q2.getValue());
    System.out.println(q3.getValue());
  }
}

// What is the result?
// The compilation fails.
// 1.99,2.99,0
// 1.99,2.99,0.0
// 1.99,2.99
// Answer: A
