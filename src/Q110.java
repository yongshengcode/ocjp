public class Q110 {
  class Student{
    String name;
    Student(String name){
      this.name = name;
    }
  }
  class Student2{
    String name;
    public Student2(String name){
      this.name = name;
    }
  }
  public static void main(String[] args) {
    var student = new Student("mike");
    var student2 = new Student2("mike");
    Student student1 = new Student("mike");
  }
}
