

public class Q212 {
    public static void main(String[] args) {
        Q212Y_1 y = new Q212Y_1("HHH");
        System.out.print(y);
    }
}
final class Q212X{

}

class Q212Y extends Q212X{

}

class Q212X_1{
String name;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

@Override
public String toString() {
    return getName();
}

}

class Q212Y_1 extends Q212X_1{
    public Q212Y_1(String name){
        super();
        setName(name);
    }
}