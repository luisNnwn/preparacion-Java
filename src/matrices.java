public class matrices {

    /*MATRICES
    * Las matrices son arreglos en dos dimensiones, que se organizan en filas y columnas
    * así:
    *
    * int matriz [] [] = {{1,2} , {3,4,5}};
    *
    * pero se pueden ir dejando vacias
    * */

    public static void main(String[] args) {


        /*Esta es la forma de declarar la matriz
        * doble corchete, doble dimension
        *
        * El primer conjunto son las filas y la otra las columnas
        *
        * FILA 0 = 1,2
        * FILA 1 = 3,4,5
        *
        * COLUMNA 0 = 1
        * COLUMNA 1 = 2
        *
        * columna 0 = 3,
        * columna 1 = 4,
        * columna 2 = 5;
        * */

        //1,2 es una fila
        //3,4,5 es una fila también
        //individualmente son columnas

        /*En java las matrices pueden ser irregulares, otsea, vemos filas con diferente
        * cantidad de columnas*/
        int matriz [] [] = {{1,2}, {3,4,5}};

        /*Con los for anidados se recorre la matriz*/
        /*i = 0 es la fila cero
        * j = 0 imprime 00 = 1
        * j=  1 imprime 01 = 2
        *
        * Luego se va al for externo, ya que i = 1
        * j = 0 imprime 10 = 3
        * j = 1 imprime 11 = 4
        * j = 2 imprime 12 = 5*/
        for (int i = 0; i < matriz.length; i++){ //recorre las filas
            for (int j = 0; j < matriz[i].length; j++){ //recorre las columnas
                System.out.println("matriz = " + matriz[i][j]);
            }
        }

        int calificaciones [][] = {{90, 80, 56}, //notas por cada alumno (contenido de las filas)
                                   {98, 69, 59},
                                   {60, 73, 98}};

        int bajaCalificacion = 100;

        for (int i = 0; i<calificaciones.length; i++){ //recorremos la fila 0
            for (int j = 0; j < calificaciones[i].length; j++){ //recorre las columnas de 0
                /*si la fila y columna es menor que la baja calificacion
                * la baja calificacion va a tomar el valor de la calificacion baja */
                if (calificaciones[i][j] < bajaCalificacion){
                    bajaCalificacion = calificaciones[i][j];
                }
            }
        }
        System.out.println("La baja calificacion es: " + bajaCalificacion);
    }

}
