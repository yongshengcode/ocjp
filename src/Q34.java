import java.util.Comparator;

public class Q34 {
    public static void main(String[] args) {
        Comparator<Integer> comparator1 = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2);
            }
        };
        Comparator<> comparator5 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2);
            }
        };
        Comparator comparator2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2);
            }
        };
        Comparator comparator4 = new Comparator<?>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2);
            }
        };
    }
}

// A. Option A
// B. Option B
// C. Option C
// D. Option D
// Answer: D