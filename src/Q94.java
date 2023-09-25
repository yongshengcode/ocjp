public class Q94 {
  public static void main(String[] args) {
    var c = new Avatar();
    c.move(1.0, 1.0);
    c.move(1, 1);
  }
}

class Game {
  public int move(int x, int y) {
    System.out.println("Game");
    return x + y;
  }
}

class Avatar extends Game {
  public int move(Number x, Number y) {
    System.out.println("Character");
    super.move(0, 0);
    return 1;
  }
}


// What is the result?

// Option A
// Option B
// Option C
// Option D
// Answer: B