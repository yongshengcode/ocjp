public class Q49 {
    public void analyze(Object[] o){
        System.out.println("object[]");
    }
    public void analyze(Object o){
        System.out.println("object");
    }
    public void analyze(long[] o){
        System.out.println("long[]");
    }
    public static void main(String[] args) {
        int[] o=new int[10];
        new Q49().analyze(o);
    }
}


// What is the output?
// A. I am an object array
// B. The compilation fails due to an error in line 1.
// C. I am an array
// D. I am an object
// Answer: D