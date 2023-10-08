public class Q143 {
    class Greeting{
        void sayHi(){
            System.out.println("hello world");
        }
    }
    public static void main(String[] args) {
        new Q143().new Greeting().sayHi();
        new Q143().new Q143.Greeting().sayHi();
    }
}


// What code must you insert on Line 1 to enable the code to print Hello world?

// Hello.Greeting myG = new Hello.Greeting() myG.sayHi();


// Hello myH = new Hello();
// Hello.Greeting myG = myH.new Greeting();
// myG.sayHi();


// Hello myH = new Hello();
// Hello.Greeting myG = myH.new Hello.Greeting();
// myG.sayHi();


// Hello myH = new Hello(); Greeting myG = new Greeting(); myG.sayHi ();

// Answer: B