public class busquedaLinealArreglos {

    /*ver clase arreglos*/
    /*BUSQUEDA LINEAL
    * Para ello creamos un metodo que recibira un entero
    * y el arreglo donde se va a buscar ese entero*/
    public int linearSearch (int valorBusqueda, int [] arregloBusqueda) {
        /*recorremos el arreglo*/
        for (int i = 0; i < arregloBusqueda.length; i++){
            //evaluamos si en alguna de las posiciones
            //i, es igual al valor que estamos buscando
            if (arregloBusqueda[i] == valorBusqueda){
                //devolvemos el i encontrado como resultado
                System.out.println("Valor encontrado: " + arregloBusqueda[i] + " en el indice " + i);
                return i;
            }
        }
        return -1;
    }
}
