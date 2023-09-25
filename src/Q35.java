import java.io.Closeable;
import java.io.IOException;

public class Q35 {
  public static void main(String[] args) {
    try (
        Test a = new Test();) {
      System.out.println("try run");
    } catch (Exception e) {
      System.out.println("eeeee");
    } finally {
      System.out.println("finally called");
    }
  }
}

class Test implements Closeable {

  @Override
  public void close() throws IOException {
    
    // throw new UnsupportedOperationException("Unimplemented method 'close'");
    System.out.println("close called");
  }

}