public class Q111 {
    private static Plant plant;
    public static void main(String[] args) {
        plant = new Tulip();
        feed(plant);
        feed(plant);
    }
    public static void feed(Plant plant){
        if (plant instanceof Tulip) {
            System.out.println("Take extra care Feed ");
        }
        plant = null;
    }
}
class Plant{}
class Tulip extends Plant{}



// What is the result?
// A. Take extra care
// B. The program prints nothing.
// C. Take extra care
// Take extra care
// D. An exception is thrown at runtime
// Answer: C