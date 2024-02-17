
package motodos_de_busqueda;


public class Busqueda_Lineal {
     //Búsqueda de forma lineal o secuencial
    int busquedaLi(int[] miarreglo, int buscar){

        int valor = -1;
        //Creamos un ciclo for para que rocorra el arreglo
        for(int i = 0; i < miarreglo.length; i++){
            if (buscar == miarreglo[i]){
                valor = i;
                break;
            }
        }
        return valor; 
    }

    
    
}
