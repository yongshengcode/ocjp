import java.util.ArrayList;
import java.util.List;

public class Q63 {
  
  @SuppressWarnings("all")
  // @SuppressWarnings("unchecked")
  
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("hello");
    print(list);
  }
@SuppressWarnings("all")
  // @SuppressWarnings("SafeVarargs")
  private static void print (List<String>... args){
    for (List<String> d : args) {
      System.out.println(d);
    }
  }
}


// Which annotation should be used to remove warnings from compilation?
// @SuppressWarnings on the main and print methods
// @SuppressWarnings(“unchecked”) on main and @SafeVarargs on the print method
// @SuppressWarnings(“rawtypes”) on main and @SafeVarargs on the print method
// @SuppressWarnings(“all”) on the main and print methods
// Answer: B