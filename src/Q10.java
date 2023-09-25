enum Q10{
  A(100),B(200);
  int v;
  Q10(int v){this.v=v;}
  // String toString(){return "200";}
  public String toString(){return String.valueOf(v);}
  public static void main(String[] args) {
    System.out.println(Q10.values()[1]);
  }
}

// Examine this code:
// System.out.println(Letter.values()[1]);
// What code should be written at line 5 for this code to print 200?
// A public String toString() { return String.valueOf(ALPHA.v); }
// B public String toString() { return String.valueOf(Letter.values()[1]); }
// C public String toString() { return String.valueOf(v); }
// D String toString() { return “200”; }
// Answer: C