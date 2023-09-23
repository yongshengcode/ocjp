import java.util.ArrayList;
import java.util.List;

public class Q95 {
    List<? super Short> list1 = new ArrayList<Number>();
    List<? super Number> list2 = new ArrayList<Integer>();
    List<? extends Number> list3 = new ArrayList<Byte>();
    List<? extends Number> list4 = new ArrayList<Object>();
    List<? super Float> list5 = new ArrayList<Double>();
}
