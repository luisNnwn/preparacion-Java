public class busquedaBinariaArreglos {

    /*Busqueda binaria en arreglos
     *
     * Es más eficiente que la busqueda lineal,
     * especialmente para busqeudas sumamente grandes
     *
     * */
    /*BUSQUEDA BINARIA*/
    public int busquedaBinaria(int llave, int[] arreglo) {
        //declaracion de tres variables
        int bajo = 0;
        int alto = arreglo.length - 1;
        int medio;

        /*La condición es que el valor de abajo sea menor
         * o igual que el alto*/
        while (bajo <= alto) {
            /*divido en dos el arreglo*/
            medio = (bajo + alto) / 2;

            /*Luego de haber dividido el arreglo: si el valor
             * que estoy buscando es igual al valor que se encuentra
             * en el medio del arreglo, devuelvo el valor medio*/
            if (llave == arreglo[medio]) {
                System.out.println("Valor encontrado: " + arreglo[medio] + " en la posición " + medio);
                return medio;
                /*si el valor buscado es menor que el valor que está en el medio
                 * entonces, se busca en la mitad inferior*/
            } else if (llave < arreglo[medio]) {
                alto = medio - 1;
            } else {
                /*se busca en la mitad superior*/
                bajo = medio + 1;
            }
            System.out.println("Valor encontrado: " + arreglo[llave]);
        }
        return -1;
    }
}
