import java.time.LocalDate;
import static java.time.DayOfWeek.*;

public class Q142 {
  public static void main(String[] args) {
    var today = LocalDate.now().getDayOfWeek();
    
    switch(today){
      case SUNDAY:
      case SATURDAY:
      System.out.println("rrrr");
      break;
      case MONDAY: 
      System.out.println("nnnn");
      default:
      System.out.println("aaaa");
    }
  }
}
