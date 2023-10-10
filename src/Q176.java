import java.util.ArrayList;
import java.util.Arrays;

public class Q176 {
    public static void main(String[] args) {
        String[] names = {"apple","orange","grape","lemon","apricot","watermelon"};
        var fruits = new ArrayList<>(Arrays.asList(names));
        fruits.sort((a,b) -> -a.compareTo(b));
        fruits.forEach(System.out::println);
    }
}

// What is the result?
// watermelonorangelemongrapeapricotapple
// nothing
// appleapricotgrapelemonorangewatermelon
// appleorangegrapelemonapricotwatermelon
// Answer: A