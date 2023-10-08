import java.util.List;
import java.util.stream.IntStream;

public class Q202 {
    public static void main(String[] a){
        final List<String> fruitList = List.of("apple", "banana");
        final List<String> types = List.of("juice", "pie");
        final var stream = IntStream.range(0, Math.min(fruitList.size(), types.size())).mapToObj(i->fruitList.get(i)+" "+types.get(i));
        
        stream.forEach(System.out::print);

    }
}


// What is the result?

// a Orange Juice
// b The compilation fails.
// c Orange Juice Apple Pie Lemmon Ice Raspberry Tart
// d The program prints nothing.
// Answer: C
