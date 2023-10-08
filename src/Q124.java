import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q124 {
    public static void main(String[] args)   {
        Path s = Paths.get("./test/a/a.txt");

        Path t = Paths.get("./test/b");
        try {
            Files.move(s, t);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Path t2 = Paths.get("./test/c/a.txt");
        try {
            Files.move(s, t2);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}



// Given the code fragment:

// Path source = Paths.get(“/repo/a/a.txt”);
// Path destination = Paths.get(“/repo”);
// Files.move(source, destination); // line 1
// Files.delete (source); // line 2
// Assuming the source file and destination folder exist, what Is the result?
// A. A java.nio.file.FileAlreadyExistsException is thrown on line 1.
// B. A java.nio.file.NoSuchFileException is thrown on line 2.
// C. A copy of /repo/a/a.txt is moved to the /repo directory and /repo/a/a.txt is deleted.
// D. a.txt is renamed repo.
// Answer: A