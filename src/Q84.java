import java.text.NumberFormat;
import java.util.Locale;

public class Q84 {
    public static void main(String[] args) {
        Locale locale = Locale.US;

        // NumberFormat formatter = NumberFormat.getInstance(locale).getCurrency();
        // NumberFormat formatter1 = NumberFormat.getCurrency(locale);
        NumberFormat formatter2 = NumberFormat.getInstance(locale);
        NumberFormat formatter3 = NumberFormat.getCurrencyInstance(locale);

        double currency = 1_00.00;
        System.out.println(formatter2.format(currency));
        System.out.println(formatter3.format(currency));
        
    }
}

// You want to display the value of currency as $100.00.
// Which code inserted on line 1 will accomplish this?
// NumberFormat formatter = NumberFormat.getInstance(locale).getCurrency();
// NumberFormat formatter = NumberFormat.getCurrency(locale);
// NumberFormat formatter = NumberFormat.getInstance(locale);
// NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
// Answer: D