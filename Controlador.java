/**
 * @author Andrés Chivalán
 * @author Micaela Yataz
 * @author Luis Montenegro
 * @version 1.1
 * @since 06/02/2022
 */
public class Controlador{
    public static void main(String[] args){
        boolean terminado = false;
        Archivo archivo = new Archivo();

        
        while(!terminado){
            Vista vista = new Vista();
            switch(vista.menu()){
                /**Gnome Sort */
                case 1:
                System.out.println("Gnome");
                break;
                /**Merge Sort */
                case 2:
                System.out.println("Merge");
                break;
                /**Quick Sort */
                case 3:
                System.out.println("Quick");
                break;
                /**Radix Sort */
                case 4:
                System.out.println("Radix");
                break;
                /**Otro Sort */
                case 5:
                System.out.println("Otro");
                break;
                /**Salir */
                case 6:
                vista.closeScan();
                terminado = true;
                break;

                default:
                vista.inputError();
                break;
            }
        }
        
    
    }
}
