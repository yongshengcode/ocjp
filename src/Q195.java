public class Q195 {
    public static void main(String[] args) {
        new Q195ConSub(4);
    }
}

class Q195ConSuper {
    protected Q195ConSuper() {
        this(2);
        System.out.println("1");
    }

    protected Q195ConSuper(int a) {
        System.out.println(a);
    }
}

class Q195ConSub extends Q195ConSuper {
    protected Q195ConSub() {
        this(4);
        System.out.println("3");
    }

    protected Q195ConSub(int a) {
        System.out.println(a);
    }
}

// What is the result?
// A. 2134
// B. 2143
// C. 214
// D. 234
// Answer: C