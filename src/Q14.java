public class Q14 {
  public static void main(String[] args) {
    int x;
    int y=5;
    if(y>2){
      x = ++y;
      y = x + 7;
    }else{
      y++;
    }
    System.out.println(x+" "+y);
  }
}

// What is the result?
// compilation error
// 0 5
// 6 13
// 5 12