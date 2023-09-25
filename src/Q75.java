import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Q75 {

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
 @interface Auth {
  String author() default "";

  String date(); 

  String[] comments() default {};
}
 

class Hello{
  @Auth(date="1-1-2020", comments = "Hello")
  public void func(){}
}

class Hello1{
  @Auth(date="1-1-2020", comments = {"Hello"}, author = "kdkdk")
  public void func(){}
}
