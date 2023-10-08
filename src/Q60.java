import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Q60 {
    public static void main(String[] args) {
        Q60Foo f1 = new Q60Foo();
        Q60Foo f2 = new Q60Bar();
        Q60Bar b1 = new Q60Bar();
        Collection<String> c = new ArrayList<>();
        List<String> c1 = new ArrayList<>();
        f1.foo(c);
        f2.foo(c);
        b1.foo(c);

        f1.foo(c1);
        f2.foo(c1);
        b1.foo(c1);
    }

}

class Q60Foo {
    public void foo(Collection a) {
        System.out.println("FOO");
    }
}

class Q60Bar extends Q60Foo {
    public void foo(Collection a) {
        System.out.println("BAR");
    }

    public void foo(List a) {
        System.out.println("List");
    }
}