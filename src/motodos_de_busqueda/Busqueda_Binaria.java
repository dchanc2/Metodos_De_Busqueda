
package motodos_de_busqueda;


public class Busqueda_Binaria {
    
        //Búsqueda binaria

    int busquedaBI(int array[], int buscar){
        int Numero = 0, TotalNumeros = array.length -1;
       

        while (Numero <= TotalNumeros){
            //Dividimos el arreglo
            int dato = Numero+(TotalNumeros - Numero)/2;
            if(array[dato] == buscar)
                return dato;

            if(array[dato] < buscar)
                Numero  = dato + 1;
            else
                TotalNumeros = dato - 1; 
        }
        return -1; 
    }

    
   
}
