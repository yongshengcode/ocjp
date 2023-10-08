public class Q190 {
  public static void main(String[] args) {
    Bar b = new Bar();
    b.foo();
    b.bar();
  }
}

class Foo {
  private void print() {
    System.out.println("foo");
  }

  public void foo() {
    print();
  }
}

class Bar extends Q60Foo {
  private void print() {
    System.out.println("bar");
  }

  public void bar() {
    print();
  }
}