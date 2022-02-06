import java.util.Scanner;
public class Vista{
  
  private Scanner scan;
   
  public Vista{
    scan = new Scanner(System.in);
  }
   
  public byte menu(){
    System.out.println("Seleccione qué tipo de algoritmo desea probar");
    System.out.println("1 Gnome\n2 Merge\n3 Merge\n4 Radix\n5 Otro\n6 Salir");
    return scan.nextByte();
  }
  public void error(){
    System.out.println("Ha ocurrido un error");
  }
  
}
