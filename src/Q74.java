import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q74 {
    public static void main(String[] args) {
        List<Q74Person> list = List.of(new Q74Person(44, "tom"), new Q74Person(40, "atom"), new Q74Person(40, "ptom"));
        List<Q74Person> ps = new ArrayList<>(list);
        ps.sort(Comparator.comparing((Q74Person::getAge)).thenComparing(Q74Person::getName).reversed());
        ps.forEach(p -> System.out.println(p.getName()));
        ps.sort(Comparator.comparing((Q74Person::getAge)).thenComparing(Q74Person::getName));
        ps.forEach(p -> System.out.println(p.getName()));
        Runnable
    }
}

class Q74Person {
    String name;
    int age;

    public Q74Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// What will be the result?
// A. Aman Tom Peter
// B. Tom Aman Peter
// C. Aman Peter Tom
// D. Tom Peter Aman
// Answer: d