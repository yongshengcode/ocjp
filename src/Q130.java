import java.util.List;

public class Q130 {
    public static void main(String[] args) {
        var items = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -1);
        if(items.stream().filter(i->i<0).findFirst()){
            System.out.println("findfirst");
        }
        if(items.stream().filter(i->i<0).findAny()){
            System.out.println("findfirst");
        }
        if(items.stream().allMatch(i->i<0) ){
            System.out.println("findfirst");
        }
        if(items.stream().anyMatch(i->i<0) ){
            System.out.println("findfirst");
        }
    }
}
