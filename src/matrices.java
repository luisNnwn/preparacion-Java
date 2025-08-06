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
        *       COLUMNAS
        * FILAS 1   2
        *       3   4   5
        * */
        int matriz [] [] = {{1,2}, {3,4,5}};

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("matriz = " + matriz[i][j]);
            }
        }

    }

}
