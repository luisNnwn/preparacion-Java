import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Date;
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
        System.out.println("Caracter en la ultima posicion: " + cadena.charAt(cadena.length() - 1));


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

        //también existe el metodo que evalua si un string termina en determinados caracteres
        System.out.println("La cadena termina en 'mente'" + pruebaSeW.endsWith("mente"));


        /*METODO INDEXOF
         * Nos permite buscar dentro de una cadena
         * */
        System.out.println("-----METODO INDEXOF-----");
        //nos dice desde donde empieza la palabra en la cadena
        System.out.println(cadena.indexOf("cadena"));
        //cuando devuelve un menos uno quiere decir que no se encuentra en la cadena
        System.out.println(cadena.indexOf("hola"));


        /*METODO SUBSTRING
         * Este metodo saca parte de una cadena desde donde le indiquemos
         * posicion inicial y final*/
        System.out.println("-----METODO SUBSTRING-----");
        //cuando no le pasamos el index final, entonces extrae todo
        //desde el indice inicial hasta el final
        //Se puede usar para extraer ciertos datos desde una base de datos o algo que se obtenga
        System.out.println("Extrayendo: " + pruebaSeW.substring(0));
        System.out.println("Extrayendo la palabra mente: " + pruebaSeW.substring(35, 40));


        /*METODO CONCAT
         * Sirve para concatenar dos String
         * */
        System.out.println("--METODO CONCAT--");
        String a = "Hola ";
        String b = "un string con un valor arbitrario";

        System.out.println("Concatenacion: " + a.concat(b));
        System.out.println("Concatenacion sin metodo: " + a + b);


        /*METODO REPLACE
         * Sirve para poder reemplazar un valor de una cadena
         * por otra o parte de una cadena por otro valor
         * */
        System.out.println("-----METODO REPLACE-----");
        //hay varias maneras
        //esta primera segun el constructor nos permite poder
        //sea un char o una palabra o varias
        System.out.println(b.replace("arbitrario", "no arbitrario"));
        //aca en lugar de reemplazar una cadena reemplazamos un char
        System.out.println(b.replace("o", "e"));
        //sirve para reemplazar pero con expresiones regulares aunque acá no lo uso
        System.out.println(b.replaceAll("\\s", "%"));
        //esto igual, pero solo reemplaza la primera ocurrencia
        System.out.println(b.replaceFirst("\\s", "p"));

        /*METODOS TOUPPERCASE Y TOLOWERCASE
         * Sirven simplemente para poner una cadena en mayusculas o minusculas
         * */
        String mayusMinus;
        System.out.println("Ingrese un String cualquiera.");
        //convertimos la cadena ingresada a mayusculas
        mayusMinus = scanner.nextLine().toUpperCase();
        System.out.println(mayusMinus);


        /*METODO TRIM
         * Elimina los espacios al inicio y final de una cadena*/
        System.out.println("METODO TRIM");
        String trimString = "       Hola           ";
        System.out.println("Sin trim: " + trimString);
        System.out.println("Con trim: " + trimString.trim());


        /*METODO TOSTRING
         * Sirve para poder convertir un objeto a String
         * */
        System.out.println("METODO TOSTRING");
        //primero tenemos una variable int
        Integer numero = 12;
        //creamos la variable a la cual vamos a asignar la conversion
        String conversion;
        //le damos a la variable donde se va a guardar el string el valor
        //de la variable a convertir y usamos el metodo toString
        conversion = numero.toString();
        System.out.println("Int convertido a String: " + conversion);


        /*METODO TOCHARARRAY
         * Sirve para convertir una cadena a un arreglo
         * aunque un String es un arreglo casi
         * */
        System.out.println("-----METODO TOCHARARRAY-----");
        String toArray = "Guadalupo es un gusano";

        //aca convertimos el String  un arreglo
        char[] arreglo = toArray.toCharArray();
        //con un for voy a recorrer desde la posicion cero
        //hasta el final
        for (int i = 0; i <= 21; i++) {
            //aca voy imprimiendo cada uno de los valores
            //de acuerdo con su posicion en indice
            System.out.println(arreglo[i] + " = " + i);
        }


        /*METODO VALUEOF
         * Sirve para convertir cualquier tipo de dato primitivo u
         * objeto a String
         * */
        System.out.println("-----METODO VALUEOF-----");
        System.out.println("Int a String " + String.valueOf(40));
        //Se puede convertir cualquier tipo de dato a string
        //probemos con el arreglo de arriba
        /*La estructura es poner primero la clase u objeto String
         * acceder al metodo valueOf y pasarle como parametro el elemento
         * a convertir en este caso el arreglo*/
        System.out.println("Arreglo a String " + String.valueOf(arreglo));


        /*METODO SPLIT
         * Sirve para separar una cadena de acuerdo a un caracter
         * que especifiquemos.
         * */
        System.out.println("METODO SPLIT");
        String mediosTransporte = "Moto, carro, avión, tranvía";
        //el objetivo es separar cada elemento, y para ello
        //tomamos la coma como el elemento para que separe
        /*Con esto, podemos crear un arreglo, a partir de un String
         * puede ser util para hacer arreglos de listas de elementos*/

        //declaramos un arreglo de STRING
        //le asignamos la variable y accedemos al metodo split
        //y le indicamos que separe cuando encuentre una coma
        String[] arreglo2 = mediosTransporte.split(",");

        //ahora imprimimos el arreglo
        //aca la condicion cambia porque tiene que ser la condicion
        //menor o igual a la longitud del arreglo menos uno, porque
        //como empieza desde el cero y length toma el total del 1
        //hay que restar uno
        for (int i = 0; i <= arreglo2.length - 1; i++) {
            System.out.println(arreglo2[i] + " = " + i);
        }

        String persona= "Alfredo Leal";
        System.out.println(persona.substring(8));
    }



}
