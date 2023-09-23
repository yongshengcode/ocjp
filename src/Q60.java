import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Q60 {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Bar();
        Bar b1 = new Bar();
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

class Foo {
    public void foo(Collection a) {
        System.out.println("FOO");
    }
}

class Bar extends Foo {
    public void foo(Collection a) {
        System.out.println("BAR");
    }

    public void foo(List a) {
        System.out.println("List");
    }
}