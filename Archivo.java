/**
 * @author Andrés Chivalán
 * @author Micaela Yataz
 * @author Luis Montenegro
 * @version 1.1
 * @since 06/02/2022
 */
import java.util.Random;
import java.io.File; 
import java.nio.file.Files;
import java.io.FileWriter;

public class Archivo{
  private static final int cantidad = 3000;
  private static Random random;
  private File file;
  private FileWriter filewriter;

  public Archivo(){}
  
  private static void fill(){
    random = new Random();
    //file = new File();
    //filewriter = new FileWriter(file);
    for(int i = 1; i<=100; i++){
      for(int j=1; j<=100; j++){
        int valor = random.nextInt(cantidad);
        //filewriter.append(Integer.toString(valor));
        //filewriter.append("\n");
      }
    }
    //filewriter.flush();
    //filewriter.close();
  }

  public boolean getArchivo(){
    
    return false;
  }
}
