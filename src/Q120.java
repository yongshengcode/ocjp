import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q120 {
    public static void main(String[] args) {
        var pool = Executors.newFixedThreadPool(10);
        Future<Integer> outcomFuture = pool.submit(() -> 1);
        System.out.println(outcomFuture);
        Future outcomFuture1 = pool.submit(() -> System.out.println(LocalTime.now()));
        System.out.println(outcomFuture1);
        pool.shutdown();
    }
}

// Given the code fragment:
// var pool = Executors.newFixedThreadPool(5);
// Future outcome = pool.submit(() > 1);
// Which type of lambda expression is passed into submit()?
// A. java.lang.Runnable
// B. java.util.function.Predicate
// C. java.util.function.Function
// D. java.util.concurrent.Callable
// Answer: D