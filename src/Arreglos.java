public class Arreglos {

    public static void main(String[] args) {

        /*ARREGLOS
        * Son estructuras donde se guardan datos pero tienen
        * que ser del mismo tipo de dato, solo int, solo char,
        * solo double, etc.
        *
        * Se declaran así:
        *
        * int nombreArreglo [] = new int [largo del arreglo];
        * o así
        * int nombreArreglo [] = {} //pero dandole los datos de una vez
        *
        * posdata, tienen indicies que empiezan desde el cero
        */

        System.out.println("-----MANIPULACION DE ARREGLOS-----");
        /*PARA ACCEDER A LOS ELEMENTOS DE UN ARREGLO:
        *
        * podemos hacer así nombreArreglo[0];
        * y así accedemos al primer elemento del arreglo
        *
        * Esto ya lo he explicado en una clase anterior
        *
        * int arreglo [] = {1, 2, 3, 4, 5, 6}
        * posicion indice   0, 1, 2, 3, 4, 5
        *
        * También podemos saber cuan grande es un arreglo
        * usando el metodo lenght... así:
        *
        * arreglo.lenght();
        *
        * */

        //un arreglo de 10 posiciones
        int arreglo [] = new int [10];

        //un arreglo con elementos predefinidos
        int arreglo2 [] = {2, 4, 6, 8, 10, 12, 14};

        /*IMPRIMIENDO POSICION DE ARREGLO*/
        System.out.println("IMPRIMIENTO POSICIÓN DE ARREGLO");
        //se puede acceder a los elementos e imprimir los valores
        System.out.println("Posición 0: " + arreglo2[0]);

        System.out.println("RECORRIENDO ARREGLO CON FOR");
        /*pero también se pueden imprimir todos los valores
        * a través de un for*/
        /*Esto no está de más explicarlo, el i es un contador
        * que tiene que ser menor o igual a la longitud menos uno
        * del arreglo porque el metodo length cuenta siete elementos
        * pero el for recorre indices, y el indice llega hasta
        * seis porque los indices comienzan en cero*/
        for (int i = 0; i<=arreglo2.length-1; i++) {
            //y aca se le pasa la posicion como i, para que vaya imprimiedo los indices
            System.out.println("Numero: " + arreglo2[i]);
        }

        /*Convirtiendo un String a un arreglo de strings*/
                            //   0      1      2       3
        String stringArreglo = "Mario, Luis, Sergio, Juan";
        String [] nombresArreglo = stringArreglo.split(",");

        for (int i = 0; i<=nombresArreglo.length-1; i++){
            System.out.println("Nombre: " + nombresArreglo[i]);
        }

        /*Un arreglo se puede alimentar de valores dinámicos
        * no solamente estáticos*/


      /*PASO VALOR Y REFERENCIA*/
        System.out.println("PASO POR VALOR Y REFERENCIA");
        //CREAMOS UN OBJETO DEL TIPO DE LA CLASE PASOVALORREFERENCIA
        pasoValorReferencia valorReferencia = new pasoValorReferencia();
        //creamos acá una variable entera
        int valorOriginal = 5;
        //mostramos el valor de la variable
        System.out.println("Valor original inicial: " + valorOriginal);
        //ahora usamos el objeto instanciado de la clase pasoValorReferencia
        //y a través del mismo accedemos al metodo modificarValor que debe recibir
        //un numero entero y le pasamos la variable creada acá y se muestra
        //el valor ya afectado
        valorReferencia.modificarValor(valorOriginal);
        //aca se vuelve a imprimir pero no se suma, porque esta copia
        //de la variable no se ve afectada, sino la copia que se le pasa
        //en la linea anterior... solo cambia en la función y nos devuelve
        //en el mensaje, el valor ya afectado
        System.out.println("Valor original = " + valorOriginal);


        int arregloOriginal [] = {1,2,3,4,5};
        for (int valor = 0; valor < arregloOriginal.length; valor++){
            System.out.println("Arreglo original = " + arregloOriginal[valor]);
        }
        //modificamos el arreglo pasando por referencia el arreglo al metodo
        //lo recorremos e imprimimos con un for
        valorReferencia.buscarReferencia(arregloOriginal);
        for (int valor = 0; valor < arregloOriginal.length; valor++) {
            System.out.println("Arreglo modificado = " + arregloOriginal[valor]);
        }

        /*Algo que logre entender y que escribí al principio
        * es que al imprimir el valor aun cuando ya ha sido afectado
        * a través de la función parece que no cambia, pero, en realidd
        * lo que cambia es una copia del objeto.
        *
        * En cambio al paso de parámetros lo que uno afecta
        * es el objeto directamente, por lo que uno cambia las formas
        * de las cosas directamente.*/


        /*BUSQUEDA LINEAL*/
        //int arregloOriginal [] = {1,2,3,4,5};
        int arregloBusqueda[] = {1,2,3,4,5};
        busquedaLinealArreglos busqueda = new busquedaLinealArreglos();
        int valorBuscar = 3;
        int elementoEncontrado = busqueda.linearSearch(valorBuscar,arregloBusqueda);
        if (elementoEncontrado != 1) {
            System.out.println("Elemento encontrado = " + elementoEncontrado);
        } else {
            System.out.println("Elemento no encontrado");
        }



    }

}
