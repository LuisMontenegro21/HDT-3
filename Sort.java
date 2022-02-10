/**
 * @author Andrés Chivalán
 * @author Micaela Yataz
 * @author Luis Montenegro
 * @version 1.1
 * @since 10/02/2022
 * 
 * Referencia de los algoritmos de sorting utilizados
 * https://www.geeksforgeeks.org/radix-sort/
 * https://www.geeksforgeeks.org/quick-sort/
 * https://www.geeksforgeeks.org/merge-sort/
 * https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
 * 
 */
import java.util.Arrays;

public class Sort{

  //constructor
  public Sort(){

  }
  /***********************************************/
  /**Métodos para el gnome sort */
  /***********************************************/
  public void gnomeSort(int array[], int a){
    int indice = 0, b = 0;
    while(indice < a){
      if(indice == 0){
        indice++;
      }
      if(array[indice] >= array[indice -1]){
        indice++;
      }
      else{
        b = array[indice];
        array[indice] = array[indice-1];
        array[indice - 1] = b;
        indice--;
      }
    }

  }
  /***********************************************/
  /**Métodos para el merge sort */
  /***********************************************/
  
  private void mergeSortMethod(int array[], int a, int b, int c){
    int n1 = b-a+1;
    int n2 = c-b;
    
    int A[] = new int[n1];
    int C[] = new int[n2];
    
    for(int i = 0; i<n1; i++){
      A[i] = array[a+i];
    }
    for(int j = 0; j<n2; j++){
      C[j] = array[b + 1 + j];
    }
    int i = 0, j = 0;
    int k = a;
    while(i<n1 && j<n2){
      if(A[i] <= C[j]){
        array[k] = A[i];
        i++;
      }
      else{
        array[k] = C[j];
        j++;
      }
      k++;
    }
    while(i<n1){
      array[k] = A[i];
      i++;
      k++;
    }
    while(j<n2){
      array[k] = C[j];
      j++;
      k++;
    }


  }

  public void mergeSort(int array[], int a, int c){
    if(a<c){
      int b = a + (c-1)/2;
      mergeSort(array, a, b);
      mergeSort(array, b + 1, c);
      mergeSortMethod(array, a, b, c);
    }

  }
  /***********************************************/
  /**Métodos para el quick sort */
  /***********************************************/

  private void cambiar(int[] array, int i, int j){
    int t = array[i];
    array[i] = array[j];
    array[j] = t;
  }

  private int particion(int[] array, int inferior, int superior){
    int pivote = array[superior];
    int i = inferior - 1;
    for(int j = inferior; j<= superior - 1; j++){
      if(array[j] < pivote){
        i++;
        cambiar(array, i, j);
      }
    }
    cambiar(array, i + 1, superior);

    return i + 1;
  }
  
  
  public void quickSort(int[] array, int inferior, int superior){
    if(inferior<superior){
      int p = particion(array, inferior, superior);
      quickSort(array, inferior, p - 1);
      quickSort(array, p + 1, superior);
    }

  }
  /***********************************************/
  /**Métodos para el radix sort */
  /***********************************************/
  private int getMaximo(int array[], int n){
    int max = array[0];
    for(int i = 1; i<n; i++){
      if(array[i] > max){
        max = array[i];
      }
    }
    return max;
  }

  private void contar(int array[], int n, int exp){
    int output[] = new int[n];
    int i;
    int contar[] = new int[10];
    Arrays.fill(contar, 0);
    for(i=0; i<n; i++){
      contar[(array[i]/exp)%10]++;
    }
    for(i=1; i<10;i++){
      contar[i] += contar[i-1];
    }
    for(i = n - 1; i>=0; i--){
      output[contar[(array[i]/exp)%10] - 1] = array[i];
      contar[(array[i]/exp%10)]--;
    }
    for(i=0; i<n; i++){
      array[i] = output[i];
    }
  }
  
  public void radixSort(int array[], int n){
    int m = getMaximo(array, n);
    for(int exp = 1; m/exp >0; exp *=10){
      contar(array, n, exp);
    }
  }
  
  /***********************************************/
  /**Métodos para el ? sort */
  /***********************************************/
  public void otherSort(){
    
  }
  
}
