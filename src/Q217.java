import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Q217 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("q217.message.obj"));
        oos.writeObject(new SerializedMessage("hello"));
        System.out.println("writeObject done");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("q217.message.obj"));
        SerializedMessage sm = (SerializedMessage) ois.readObject();
        System.out.println("readObject done: " + sm);
    }
}

class SerializedMessage implements Serializable {
    String message;
    LocalDateTime createdDateTime;
    transient LocalDateTime updatedDateTime;

    SerializedMessage(String message) {
        this.message = message;
        this.createdDateTime = LocalDateTime.now();
        System.out.println("create SerializedMessage: " + this.createdDateTime);
    }

    private void readObject(ObjectInputStream ois) {
        System.out.println("readObject: " + this);
        try {
            ois.defaultReadObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        this.updatedDateTime = LocalDateTime.now();
        System.out.println("readObject: " + this.updatedDateTime);
    }
}
