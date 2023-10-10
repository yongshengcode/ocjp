public class Q82 extends CustomType {
    public static void main(String[] args) {
        String[] words = {"banana","apple"};
        Integer[] nums = {1,2,3};
        CustomType type = new CustomType();
        CustomType<String> stringType = new CustomType<>();
        System.out.println(stringType.count(words, "apple"));
        System.out.println(type.count(nums, 3));
        System.out.println(type.count(words, "apple"));
    }
}

class CustomType<T> {
    public <T> int count(T[] array, T element){
        int count =0;
        for (T t : array) {
            if(t.equals(element)) ++count;
        }
        return count;
    }
}

// What is the result?
// a A NullPointerException is thrown at run time.
// b The compilation fails.
// c 1
//   Null
//   null
// d 1
//   1
//   1
// e A ClassCastException is thrown at run time.
// Answer: d