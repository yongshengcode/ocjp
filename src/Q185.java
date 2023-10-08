public class Q185 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        sb.append("howdy");
        sb.insert(0, ' ');
        sb.replace(3, 5, "ll");
        sb.insert(6, "cow");
        sb.delete(2, 7);
        System.out.println(sb.length());
    }
}


// What is the result?
// A. 4
// B. 3
// C. An exception is thrown at runtime.
// D. 5
// Answer: A