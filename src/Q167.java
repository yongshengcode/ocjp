import java.util.Arrays;
import java.util.Comparator;

public class Q167 {
    static class Person implements Comparator<Person> {
        public String name;
        public Person(String name) {
            this.name = name;
        }

        @Override
        public int compare(Q167.Person o1, Q167.Person o2) {
            return o1.name.compareTo(o2.name);
        }

    }

    static class Person1 implements Comparable<Person1> {
        public String name;

        public Person1(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Q167.Person1 o) {
            return o.name.compareTo(this.name);
        }

    }

    public static void main(String[] args) {
        Person[] p1 = { new Person("b"), new Person("a") };
        Arrays.sort(p1);
        
        for (Person person : p1) {
            System.out.println(person.name);
        }
        Person1[] p2 = { new Person1("b"), new Person1("a") };
        Arrays.sort(p2);
        for (Person1 person1 : p2) {
            System.out.println(person1.name);
        }
    }
}
