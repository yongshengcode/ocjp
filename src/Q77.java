import java.util.List;
import java.util.function.BinaryOperator;

public class Q77 {
    public static void main(String[] args) {
        List<Double> list = List.of(100.0,200.0);
        BinaryOperator<Double> bo=(a,b)->a+b;
        double total=list.stream().map(x->x * 0.8).reduce(bo).orElse(0.0);
        double total1=list.stream().map(x->x * 0.8).reduce(0.0,bo);
    }
}


// Which statement is equivalent to line 1?
// A. double totalSalary = list.stream().map(e > e.getSalary() * ratio).reduce (bo).ifPresent (p >
// p.doubleValue());
// B. double totalSalary = list.stream().mapToDouble(e > e.getSalary() * ratio).sum;
// C. double totalSalary = list.stream().map(Employee::getSalary * ratio).reduce (bo).orElse(0.0);
// D. double totalSalary = list.stream().mapToDouble(e > e.getSalary() * ratio).reduce(starts, bo);
// Answer: C