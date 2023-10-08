import java.util.Random;
import java.util.stream.DoubleStream;

public class Q136 {
    public static void main(String[] args) {
        var r = new Random();
        new DoubleStream(r::nextDouble).limit(100).forEach(System.out::print);
        DoubleStream.generate(Random::nextDouble).limit(100).forEach(System.out::print); 
        DoubleStream.generate(Random.nextDouble).limit(100).forEach(System.out::print);
        DoubleStream.generate(r::nextDouble).limit(100).forEach(System.out::print);
    }
}
