import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q39 {
  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    list1.add("A");
        list1.add("B");
        List<String> list2 = Collections.unmodifiableList(list1);
        
        list1.add("C");
        list2.add("D");
        System.out.println(list1);
        System.out.println(list2);

  }
}
