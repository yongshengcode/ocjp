import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
  public static void main(String[] args) {
    List<List<Integer>> list = new ArrayList<>();
    list.add(List.of(1,2));
    list.add(List.of(3,4));
    list.add(List.of(5));
    var s1=list.stream().flatMap(l->l.stream());
    var r1=Arrays.toString(s1.toArray());
    System.out.println(r1);
    list.stream();
    Stream.iterate(0,a->a+1).reduce(0,(n,m)->n+m);
  }
}
