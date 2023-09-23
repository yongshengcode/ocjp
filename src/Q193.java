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
// Question #:193
// Given the contents:
// MessageBundle.properties file:
// message=Hello
// MessageBundle_en.properties file:
// message=Hello (en)
// MessageBundle_US.properties file:
// message=Hello (US)
// MessageBundle_en_US.properties file:
// message=Hello (en_US)
// MessageBundle_fr_FR.properties file:
// message=Bonjour
// and the code fragment:
// Locale.setDefault(Locale.FRANCE);
// Locale currentLocale = new Locale.Builder().setLanguage(“en”).build();
// ResourceBundle messages = ResourceBundle.getBundle(“MessageBundle”, currentLocale);
// System.out. println(messages.getString(“message”));
// Which file will display the content on executing the code fragment?
// A. MessageBundle_en_US.properties
// B. MessageBundle_en.properties
// C. MessageBundle_fr_FR.properties
// D. MessageBundle_US.properties
// E. MessageBundle.properties
// Answer: C