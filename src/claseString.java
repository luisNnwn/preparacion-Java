import java.sql.SQLOutput;
import java.util.Scanner;

public class claseString {

    public static void main(String[] args) {

        /*La clase String pertenece al package
        * java.lang.
        *
        * Tiene muchos metodos útiles para la programación
        * en Java
        *
        * Hay dos formas de declarar un objeto Stringd:
        * 1- String nombre = "Hola
        * 2- String string = new String();"*/

        /*INMUTABILIDAD DE LA CLASE STRING
        *
        * Se refiere  a que no puede cambiar su valor,
        * otsea, dentro del transcurso del programa no se
        * puede cambiar el valor del String.
        *
        * Esto tiene que ver con que al crear un String y luego
        * concatenarle un valor, entonces creamos un nuevo objeto,
        * entonces el objeto original se libera pero se crea un nuevo
        * objeto String
        *
        * String saludo = "Hola"; //se libera
        * saludo = saludo + "mundo" //se crea un nuevo objeto al modificar un objeto
        * */


        //METODO LENGHT
        System.out.println("-----METODO LENGTH-----");
        System.out.println("Metodo para conocer el largo de una cadena");

        //dos maneras de crear objetos string
        //la normal
        String cadena = "Esto es una cadena";
        //con new, pero no es obligacion ponerle algod adentro
        //como parametro
        String cadena2 = new String("Hola");

        //el metodo lenght nos da que tan larga tenemos la cadena
        System.out.println("El largo de la cadena = " + cadena.length());
        System.out.println("El kago del String declarado con new es = " + cadena2.length());


        //METODO charAt()
        System.out.println("-----METODO CHARAT()-----");
        System.out.println("Es un metodo que nos permite devolver un caracter de una posicion de un string, empezando desde cero");

        //el metodo lenght nos devuelve un caracter de un String en una posicion determinda
        System.out.println("El caracter numero 6 de la primera variable es: " + cadena.charAt(5));
        System.out.println("El caracter numero 2 de la segunda variable es: " + cadena2.charAt(1));

        //podemos saber con length y charAt la longitud de una cadena
        /*Aca ocupamos cadena.lenght()-1, es menos uno porque aunque son 18 caracteres, el ultimo caracter esta
        * en la posicion numero 17, dado que la longitud se mide contando desde la posicion cero
        *
        * Si hicieramos esto:
        *   System.out.println("Longitud cadena: " + cadena.charAt(cadena.length()));
        * Veriamos este error en la consola:
        * Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 18 out of bounds for length 18
        * Que básicamente nos indica que lo que estamos solicitando excede la cantidad numerica de indices, es decir,
        * el metodo lenght le pasa a charAt el indice numero 18 de la variable, pero como ya dije se contabiliza desde
        * 0 a 17, y sí, son 18 indices en total, pero al incluir el cero se contabiliza hasta 17, por lo tanto, se
        * le debe especificar al metodo length que le pasa el parametro a charAt, que se desea, la última letra de acuerdo
        * con la longitud del string pero restandole uno
        *
        * */
        //la longitud contabiliza la cantidad de indices, pero empieza desde el cero
        System.out.println("Longitud cadena: " + cadena.length());
        //restamos menos uno a la longitud para poder imprimir la ultima letra en el indice 17
        System.out.println("Caracter en la ultima posicion: " + cadena.charAt(cadena.length()-1));


        //METODO EQUALS e EQUALSIGNORECASE
        /*Este metodo permite poder comparar cadenas de texto, con la diferencia
        * de que equals compara exactamente la palabra, tomando en cuenta
        * si está escrita en mayuscula o minuscula; en cambio, equalsIgnoreCase es más
        * (como ya he mencionado con anterioridad) como la Dra. Polo "No le importa tu raza
        * o tu sexo, pa´que hablar de eso"... solo que aca al metodo le da igual si la
        * palabra esta en mayuscula, minuscula, si pusiste una letra intercada de mayuscula, le da igual,
        * otsea, no le importa, le es indiferente. Espero que haya quedado claro de que le da igual */

        System.out.println("-----METODOS EQUALS E EQUALSIGNORECASE-----");
        //comparamos con un if
        String cadenaEquals = "Mondongo";
        String cadenaEqualIgnoreCase = "MoNdONgO";

        System.out.println("CadenaEquals = " + cadenaEquals);
        System.out.println("CadenaEqualsIgnoreCase = " + cadenaEqualIgnoreCase);
        System.out.println("¿La cadenaEquals es igual a la cadenaEqualsIgnoreCase? " + cadenaEquals.equals(cadenaEqualIgnoreCase));
        System.out.println("No son iguales porque a palabras iguales, el metodo equals distingue mayusculas de minusculas");

        String respuesta;
        boolean isCorrect = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba como quiera mondongo y compruebe que el metodo EqualsIgnoreCase dira que la condicion es true");
        respuesta = scanner.nextLine();
        //en este condicional evaluo usando el metodo equalsIgnoreCase pasandole como
        //parametro el valor de la variable cadenaEquals
        if (respuesta.equalsIgnoreCase(cadenaEquals)) {
            //no olvidar cambiar el estado de la variable al validar que es igual
            isCorrect = true;
            System.out.println("La cadena es igual? " + isCorrect);
        } else {
            System.out.println("Mejor pruebe con mondongo");
        }


        /*METODOS STARTSWITH Y ENDSWITH*/
        /*Estos metodos sirven para saber si una cadena empieza
        * con determinados caracteres o si termina con un
        * subcaracter, respectivamente y devuelve true o false*/
        System.out.println("STARTSWITH Y ENDSWITH");
        System.out.println("La cadena empieza con 'Esto' " + cadena.startsWith("Esto"));
        System.out.println("La cadena2 empieza con 'Holas' " + cadena2.startsWith("Holas"));
        System.out.println("La cadena termina con 'na' " + cadena.endsWith("na"));
        System.out.println("La cadena2 terminca con 'la' " + cadena2.endsWith("la"));

        //Cabe destacar que estos metodos distinguen entre mayusculas y minusculas, por lo que
        //podríamos combinarlo con el metodo EqualsIgnoreCase

        //al momento todavía no se como combinarlos, pero se puede controlas
        //con el metodo toLowerCase y toUpperCase segun corresponga
        /*Pero aca vamos a suponer que tenemos palabras que están en minusculas
        * */

        //esto no funciona
        String pruebaSeW = "una serie de palabras random de mi mente";
        String respuesta2;

        /*Esto puede ser bastante útil cuando se tenga que comparar un valor ingresado por el usuario
        * y que este por alguna extraña razón, a pesar de especificarle la manera en que ingrese el valor
        * lo introduzca igual, pero en mayusculas y falle alguna validacion*/
        System.out.println("Introduzca un articulo indeterminado femenino ");
        //convierto la entrada de texto a minusculas
        /*posdata sobre esto, es importante convertir el valor desde donde se captura con el scanner
        * porque si hace abajo así:
        *  respuesta2 = scanner.nextLine();
        *  respuesta2.toLowerCase();
        * no funciona y no evalua bien en el if
        * */
        respuesta2 = scanner.nextLine().toLowerCase();
        //evaluo si la respuesta dos una vez convertida a minusculas empieza con "una"
        if (respuesta2.startsWith("una")) {
            System.out.println("Sí esa es");
        } else {
            System.out.println("No mijo, esa no es");
        }






    }

}
