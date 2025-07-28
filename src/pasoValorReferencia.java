public class pasoValorReferencia {

        /*
        * Cuando creamos un metodo entre parentesis se
        * especifica lo que queremos que reciba el metodo
        * para poder usarlo dentro del mismo.
        *
        * Al declarar una variable y pasarla al metodo, pasamos
        * el valor, una copia de la variable sin que se altere el valor
        *
        * int numero = 10;
        * Multiplicar (numero);
        *
        * Al pasar un objeto, se pasa por referencia
        * Date fecha = new Date();
        * No se crea un objeto sino que se pasa una referencia al objeto
        * real, y modifica el objeto original
        *
        * int arreglo[] = new int [6];
        * modificarArreglo (arreglo);
        *
        */

    //se recibe un entero y se le suma uno
    public void modificarValor(int valor){
        //aca importante este operador, hacemos una preadición
        valor += 1;
        System.out.println("valor desde el metodo= " + valor);
    }

    //se pasa por referencia un arreglo
    public void buscarReferencia(int [] arreglo) {
        //se recorre el arreglo
        for (int i = 0; i < arreglo.length; i++){
            /*se modifica el valor del arreglo en cada una
            * de las posiciones, quiere decir que el arreglo
            * en todos los i's va a ser igual al valor del arreglo
            * en cada i multiplicado por 2*/
            arreglo[i] = arreglo[i] *2;
        }
    }


}
