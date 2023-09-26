import java.util.List;

public class Q222 {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(2, 3, 0, 8, 1, 9, 5, 7, 6, 4);
    int sum = numbers.stream().reduce(0, (n,m)->n+m);
    System.out.println(sum);
    System.out.println(numbers.stream().reduce(Integer::sum));
    // numbers.stream().iterator(0,a->a+1).reduce(0,(n,m)->n+m);
    int sum1=numbers.parallelStream().reduce(0,  (n,m)->n+m);
    System.out.println(sum1);
    numbers.stream().flatMap(a->a).reduce(0,  (n,m)->n+m);
  }
}
