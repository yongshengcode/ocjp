import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Q214 {
    public static void main(String[] args) {
        List<Reader> dataFiles = new ArrayList<>();
        File indexFile = new File("null");
        try (BufferedReader indexReader = new BufferedReader(new FileReader(indexFile)) ) {
            for (String file = indexReader.readLine(); file != null; = indexReader.readLine()) {

                try (
                    BufferedReader dataReader = new BufferedReader(new FileReader(new File(file)));
                ) {
                     dataFiles.add(dataReader);
                
                    // try(
                    //     porcessData(dataReader)
                    // ){

                    // }

                    porcessData(dataReader);
                    // dataReader.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                
                
               
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally{
            for (Reader reader : dataFiles) {
                try {
                    reader.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }
    static void porcessData(BufferedReader dataReader){

    }
}
