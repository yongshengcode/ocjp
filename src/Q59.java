import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q59 {
    public static void main(String[] args) {
        try (
                Reader reader1 = new FileReader("readme.md");
                Reader reader2 = new FileReader("readme.md");
                Reader reader3 = new FileReader("readme.md");) {

        } catch (IOException e) {
            Logger.getLogger(Q59.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("done");
    }
}

// "java.project.outputPath": "bin",
// "[java]": {
// "editor.snippetSuggestions": "inline",
// "editor.suggest.snippetsPreventQuickSuggestions": false
// },

// When run and all three files exist, what is the state of each reader on Line
// 1?

// All three readers are still open.
// All three readers have been closed.
// The compilation fails.
// Only reader1 has been closed.

// Answer: B