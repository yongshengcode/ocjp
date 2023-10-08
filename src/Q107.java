public class Q107 implements A107_1,A107_2{
    public static void main(String[] args) {
        Q107 q = new Q107();
        q.aa();
    }
    public void aa(){
        System.out.println("a107 00");
    }
}

interface A107{
    void aa();
}

interface A107_1 extends A107{
    default void aa(){
        System.out.println("a107 1");
    }
}

interface A107_2 extends A107{
    default void aa(){
        System.out.println("a107 2");
    }
}


// Which statement is true about the Fox class?
// A. Fox class does not have to override inhabit method, so long as it does not try to call it.
// B. Fox class does not have to override the inhabit method if Forest and Town provide compatible
// implementations.
// C. Fox class must implement either Forest or Town interfaces, but not both.
// 184 of 197
// Oracle - 1z0-819
// D. The inhabit method implementation from the first interface that Fox implements will take precedence.
// E. Fox class must provide implementation for the inhabit method.
// Answer: E