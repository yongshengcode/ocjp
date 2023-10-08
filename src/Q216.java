import java.util.function.Function;

public class Q216 {
    public static void main(String[] args) {
        Function tripler = x->(Integer)x*3;
        Q216.printValue(tripler, 4);
    }
    public static <T> void printValue(Function f, T num){
        System.out.println(f.apply(num));
    }
}
 class Q216_1 {
    public static void main(String[] args) {
        Function<Integer,Integer> tripler = x-> { return (Integer)x*3;};
        Q216.printValue(tripler, 4);
    }
    public static <T> void printValue(Function<T,T> f, T num){
        System.out.println(f.apply(num));
    }
}



// Compiling TripleThis.java gives this compiler warning:
// Note: TripleThis.java uses unchecked or unsafe operations.
// Which two replacements done together remove this compiler warning?
// A. Replace line 9 with function<Integer> tripler = x-> - { return (Integer) X * 3 ; }.
// B. Replace line 12 with public static void printValue function<Integer> f, int num) {.
// C. Replace line 12 with public static int printValue function<Integer, Integer>, f, T num {.
// D. Replace line 12 with public static <T> void printValue (Function<T, T> f, T num ) {,
// E. Replace line 9 with function<Integer, Integer> = X -> { return (integer) x * 3; }.
// Answer: D E 