import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class e {
    public static void main(String[] args) throws IOException {
        byte[] b=Files.readAllBytes(Path.of("./src/e.txt"));
        
        Files.write(Path.of("e.zip"), Base64.getDecoder().decode(b));
    }
}
