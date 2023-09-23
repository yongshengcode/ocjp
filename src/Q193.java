import java.util.Locale;
import java.util.ResourceBundle;

public class Q193 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.FRANCE);
        // Locale currnLocale = new Locale.Builder().setLanguage("en").build();
        Locale currnLocale = new Locale.Builder().setLocale(new Locale("en", "US")).build();
        System.out.println(currnLocale);
        ResourceBundle messages = ResourceBundle.getBundle("MessageBundle",currnLocale);
        System.out.println(messages.getString("message"));
    }
}
