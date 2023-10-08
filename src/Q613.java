import java.util.ArrayList;

public class Q613 {
    public static void main(String[] args) {
        var data = new ArrayList<>();
        data.add("“Peter”");
        data.add(30);
        data.add("“Market Road”");
        data.set(1, 25);
        data.remove(2);
        data.set(3, 1000L);
    }
}


// What is the output?
// A. [Market Road, 1000]
// B. [Peter, 30, Market Road]
// C. [Peter, 25, null, 1000]
// D. An exception is thrown at run time


// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.set(ArrayList.java:441)
//         at Q613.main(Q613.java:11)