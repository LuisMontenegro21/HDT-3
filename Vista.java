/**
 * @author Andrés Chivalán
 * @author Micaela Yataz
 * @author Luis Montenegro
 * @version 1.1
 * @since 06/02/2022
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Vista{
  
  private Scanner scan;
   
  public Vista(){
    scan = new Scanner(System.in);
  }
   
  public byte menu(){
    System.out.println("Seleccione qué tipo de algoritmo desea probar");
    System.out.println("1 Gnome\n2 Merge\n3 Quick\n4 Radix\n5 Otro\n6 Salir");
    try {
      return scan.nextByte();
    } catch (InputMismatchException e) {
      return 0;
    }
  }
  public void inputError(){
    System.out.println("Ingrese un valor permitido");
  }

  public void fileError(){
    System.out.println("Parece que el archivo no se encuentra en la dirección solicitada. Por favor colocarlo en el mismo directorio.");
  }

  public void closeScan(){
    System.out.println("Saliendo");
    scan.close();
  }
  
}
