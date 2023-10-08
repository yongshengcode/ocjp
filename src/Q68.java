
public class Q68 {
    
}
@interface Resource{
    String name();
    int priority() default 0;
}

@Resource(priority = 100)
class ProcessOrders{}

@Resource(name="test")
class ProcessOrders1{}

@Resource
class ProcessOrders2{}