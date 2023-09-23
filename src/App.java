import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

abstract class App {
    final static String aaaaa = "dddd";

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // System.out.println("App.main()");

        String bb = "c";

        String aa = "a" + "b" + bb;

        String a = "adsf";
        String b = "adsf";
        System.out.println(a == b);
        B bbb = new B();
        bbb.printinfo();

        ArrayList<String> list = new ArrayList();
        list.add(b);

        System.out.println(list);
        System.out.println("ttttttttttttt");

        Runtime r = Runtime.getRuntime();
        System.out.println(r.availableProcessors());

        System.out.println(r.totalMemory() / 1024 / 1024);
        System.out.println(r.freeMemory() / 1024 / 1024);

        // Process p = r.exec("code");
        // Thread.sleep(5555);
        // p.destroy();

        Instant now = Instant.now();
        // Instant.now();
        System.out.println(1);
        System.out.println(Duration.between(now, Instant.now()).toNanos());
        Arrays.sort(args, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return 1;
            }

        });

        Map<String, Integer> map = new HashMap<>();

        map.put("aaa", 1);
        map.put("bbb", 2);
        map.put("ccc", 3);
        map.put("aaa", 4);
        System.out.println(map);

        // Iterator it= list.iterator();
        new TreeSet();
        new LinkedHashSet<>();
        new HashSet<>();

        System.out.println("----------------------------------");
        InputStream is = new FileInputStream("src/a.txt");
        int b1;
        while ((b1 = is.read()) != -1) {
            System.out.println(b1);
        }
        is.close();
        String ss = "我";


        for (byte bytes : ss.getBytes("GBK")) {
            System.out.println((int)bytes);
        }
        for (byte bytes : ss.getBytes("UTF-8")) {
            System.out.println((int)bytes);
        }
        System.out.println(ss.getBytes());
    }

}

class A {
    String a = "AAAAAAAAAAAA";
    int i;

    void printinfo() {
        System.out.println("AAAAAAAA");
        System.out.println(this);

        System.out.println(this.a);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((a == null) ? 0 : a.hashCode());
        result = prime * result + i;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (a == null) {
            if (other.a != null)
                return false;
        } else if (!a.equals(other.a))
            return false;
        if (i != other.i)
            return false;
        return true;
    }

}

class B extends A {
    String a = "BBBBBBBB";

    void printinfo() {
        super.printinfo();
        System.out.println("BBBBBBBBBB");
        System.out.println(this);
        System.out.println(this.a);
    }
}
// 我
