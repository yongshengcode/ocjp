import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q174 {
    static Map<String, String> map = new HashMap<>();
    static List<String> keys = new ArrayList<>(List.of("S", "P", "Q", "R"));
    static String[] values = new String[] { "ss", "pp", "qq", "rr" };
    static {
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values[i]);
        }
    }
    public static void main(String[] args) {
        keys.clear();
        values=new String[0];
        System.out.println(""+keys.size()+values.length+map.size());
    }
}

// What is the result?
// A. Keys: 4 Values: 4 Map: 0
// B. Keys: 4 Values: 4 Map: 4
// C. The compilation fails.
// D. Keys: 0 Values: 0 Map:
// E. Keys: 0 Values: 0 Map: 0
// Answer: Keys: 0 Values: 0 Map: 4

// wrong