
import java.util.Arrays;
import java.util.Comparator;

public class Q180 {
  public static void main(String[] args) {
    String[] towns={"boston","paris","bangkok","oman"};
    Comparator<String> ms = (a,b)->b.compareTo(a);
    Arrays.sort(towns,ms);
    System.out.println(Arrays.toString(towns));
    System.out.println(Arrays.binarySearch(towns,"oman",ms));
  }
}

// What is the result?
// 2
// -1
// 1
// -3
// Answer: C
