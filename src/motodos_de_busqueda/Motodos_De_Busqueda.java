
package motodos_de_busqueda;

import java.util.Arrays;
import java.util.Scanner;


public class Motodos_De_Busqueda {

    public static void main(String[] args) {
       
        int[] arreglo = {5, 10, 15, 20, 30, 55, 68};
        
        Busqueda_Binaria busquedabinaria = new Busqueda_Binaria();
        Busqueda_Lineal busquedalineal = new Busqueda_Lineal();
        
                //Impriminmos un mensaje de busqueda
        System.out.println("Que numero desea buscar: ");
        //Pedimos al usuario que ingrese un número a buscar y lo guardamos en la variable buscar
        System.out.println("Ingrese el número a buscar en el arreglo: ");
        Scanner entrada = new Scanner(System.in);
        int buscar = entrada.nextInt();
        
                System.out.println("Busqueda Lineal");
        //Mostramos el arreglo original
        System.out.println("Estos son los datos: " + Arrays.toString(arreglo));
        int resultadoLin = busquedalineal.busquedaLi(arreglo, buscar);
        //creamos un if para ver si el resultado es igual a nulo
        if (resultadoLin == -1)
            System.out.println("El número no se encuentra");
        else
            //Si no es igual a -1 significa que si existe dentro del arreglo y se muestra el siguiente mensaje
            System.out.println("El numero buscado esta en la posicion: " + resultadoLin);

        System.out.println("Busqueda Binaria");
        //Primero ordenamos el arreglo
        Arrays.sort(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));

        int resultadoBin = busquedabinaria.busquedaBI(arreglo, buscar);
        if(resultadoBin == -1)

            System.out.println("El número no se encuentra");
        else

            System.out.println("El numero buscado esta en la posicion: " + resultadoBin);





    }
    }
    

