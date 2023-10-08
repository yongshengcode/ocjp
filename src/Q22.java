import java.util.List;
import java.util.function.Function;

public class Q22 {
    public static void main(String[] args) {
        var numList = List.of(1, 2, 3, 3, 4, 5, 6, 9, 8, 7);
        Function<Integer, Integer> f = i -> i + 2;
        // Function<Integer> f = n -> n * 2;
        StringBuilder sb = new StringBuilder();
        for (int i : numList) {
            sb.append(f.apply(i));
        }
        System.out.println(sb.toString());
    }
}
