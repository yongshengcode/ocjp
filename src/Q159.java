import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;

public class Q159 {
  public void write1(String filename) {
    try (FileChannel fc = (FileChannel) Channels.newChannel(new FileOutputStream(filename));) {
      fc.write(ByteBuffer.wrap(new byte[] { 'a' }));
    } catch (Exception e) {
      // TODO: handle exception
    }

  }
  public void write2(String filename) {
 
    try (FileChannel fc = new FileOutputStream(filename).getChannel();) {
      fc.write(ByteBuffer.wrap(new byte[] { 'b' }));
    } catch (Exception e) {
      // TODO: handle exception
    }

  }

  public static void main(String[] args) {
    new Q159().write1("q159-1");
    new Q159().write2("q159-2");
  }
}

class B {
  {
    try(FileChannel fc=new FileChannel(new FileOutputStream(filename) ){}
  }
}