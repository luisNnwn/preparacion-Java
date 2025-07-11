import java.lang.Integer;
import java.sql.SQLOutput;

public class variablesYTiposDeDatos {
    public static void main(String[] args) {

        /*Para empezar una variable es un
        * espacio en memoria con un valor que puede o no
        * ser constante*/

        //Reglas:
        /*- las variables se representan con cadenas de texto
        * - el primer caracter puede ser una letra, numero, simbolo
        *   dolar o subrayado
        * - al elegir un nombre de variable, debe ser legible y
        *   significativo, para que se autodocumente
        * - casi por convención se empieza por minuscula, pero
        *   si es en compuesta, o sea, tiene un nombre compuesto
        *   se separa con mayuscula así:
        *
        *   nombreVariable */

        //Declaracion de variables
        //hay varias formas de declararlas:
        // - con nombre compuesto o sin.
        // - sin inicializar o no
        int a;
        int bInicializado = 3;
        String cadena;
        String cadenaDos = "Hola";
        //las variables booleanas solo reciben dos valores
        boolean flag = true;
        boolean flagFalso = false;
        //pero solo hasta seis decimaes
        double decimal = 0.99;

        /*¿Que es la memoria? Al declarar una variable
        * se hace uso de un espacio de memoria en la computadora, donde
        * se guarda el nombre de la variable y el valor asignado.
        * Sin embargo, las variables pueden sobreescribirse, y en memoria
        * se borra el valor anterior y se coloca el nuevo valor.
        * Así también, a partir de un espacio de memoria, se puede
        * llegar a contener otro espacio de memoria o el valor almacenado
        * un caso así sería cuando declaramos una variable normal
        * y luego hacemos por ejemplo una suma a esa variable, así:
        *
        * int a = 3;
        * suma = a + 10;
        */

        //TIPOS DE DATOS PRIMITIVOS.

        /*                          TAMAÑO          VALOR MINIMO               VALOR MAXIMO
        * boolean(true or false)     1 bit
        * char(caracter)            16 bits
        * byte(entero con signo)    8 bits             -128                        128
        * short(entero con signo)   16 bits           -32768                      32767
        * int(entero con signo)     32 bits           un monton                  un monton
        * long(entero con signo)    64 bits     un monton mas grande        un monton mas grande
        * float(decimal)            32 bits     lo anterior pero mas        lo anterior pero más
        * double (decimal)          64 bits     lo anterior pero mas        lo anterior pero mas
        *
        *
        * */


        System.out.println("-----BOOLEAN------");
        //boolean
        //se usan bastante en los condicionales de if
        //evaluan si una expresion es cierta o no
        boolean flag2 = true;
        boolean flag3 = false;
        int a1 = 5;
        int b2 = 10;

        if (a1 < b2) {
            System.out.println("Es " + flag2 + " el primer numero: " + a1 + " es menor " + " que " + b2);
        } else {
            System.out.println("Es " + flag3 + " el primer numero: " + a1 + " es mayor " + " que " + b2);
        }


        System.out.println("-----CHAR------");
        //char: este dato solo almacena un caracter
        //y se usa comilla simple para guardarlo
        char letra = 'A';
        //pero también hay otras formas de hacerlo
        //con codigo ASCII o unicode
        //aca la tablita: https://symbl.cc/es/unicode-table/
        char letraA = '\u0041';
        System.out.println("Char normal: " + letra + "; letra unicode: " + letraA);
        //pero también se puede poner directamente el numero correspondiente en la tabla
        char letraAConNumero = 65;
        System.out.println("Letra A con numero: " + letraAConNumero );

        //btw se pueden sumar chars
        char var1 = 'A'+65;
        System.out.println(var1);


        System.out.println("-----BYTE------");
        //byte: almacena numeros enteros pequeños
        // esta declaracion no es permitida porque el limite es 127 byte a3 = 128;
        //igual, el limite para negativos es -128 byte b3 = -129;
        byte a3 = 127;
        byte b3 = -128;
        System.out.println("Los limites para el tipo de dato byte van desde: " + a3 + " hasta: " + b3);


        System.out.println("-----SHORT------");
        //esta declaracion no es valida short = chor o calsoneta porque
        //son sinonimos que no tienen nada que ver con la programacion
        //pero gracias por leer el comentario
        short a4 = -32768;
        short b4 = 32767;
        System.out.println("Los limites para el tipo de dato short van desde: " + a4 + " hasta: " + b4);


        System.out.println("-----INT------");
        int a5 = -2147483648;
        int b5 = 2147483647;
        System.out.println("Los limites para el tipo de dato int van desde: " + a5 + " hasta: " + b5);

        System.out.println("-----DATOS COMO CLASE JAVA------");
        //Tipos de datos como clase Java
        //Una clase en Java, es una plantilla que tiene atributos
        //o ciertos comportamientos que podemos usar, como funciones pues

        //aca lo nuevo es Integer, para poder usarlo debemos importar
        //la clase Integer con import java.lang.Integer... Al escribir Integer
        //y luego poner el punto apareceran todos los metodos a los que
        //podemos acceder
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        //para ampliar mas sobre estos metodos se pude mantener CTRL(cotorol) + CLICK sobre Integer
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);


        System.out.println("-----LONG------");
        //Long
        //acá ya no voy a poner cual es el maximo y minimo de cada
        //uno, pero lo voy a guardar directamente en la variable
        //para no escribir tal cantidad de numeros
        long a6 = Long.MAX_VALUE;
        long b6 = Long.MIN_VALUE;

        System.out.println("Los limites para el tipo de dato long van desde: " + a6 + " hasta: " + b6);


        System.out.println("-----FLOAT------");
        //float, son decimales, pero estos solo permiten hasta 6 decimales
        float a7 = Float.MAX_VALUE;
        float b7 = Float.MIN_VALUE;

        System.out.println("Los limites para el tipo de dato float van desde: " + a7 + " hasta: " + b7);

        //este tipo de dato se puede definir así
        float  unFloat = 9;
        System.out.println("unFloat = " + unFloat);
        //sin embargo, si queremos definirlo por ejemplo así: 9.4
        //es importante agregar "f" para que no de error
        unFloat = 9.4f;
        System.out.println("unFloat = " + unFloat);
        //importante también decir que tien un límite a mostrar
        //de seis decimales
        unFloat = 3.5625f;
        System.out.println("unFloat = " + unFloat);
        //¿Cómo expresarlo en notación científica?
        //unFloat = 9.909091f = 9.909091e1f
        unFloat = 9.909091f;
        System.out.println("unFloat = " + unFloat);


        //Double
        System.out.println("-----DOUBLE------");
        double a8 = Double.MAX_VALUE;
        double b8 = Double.MIN_VALUE;

        System.out.println("Los limites para el tipo de dato double van desde: " + a8 + " hasta: " + b8);


        System.out.println("-----USO DE VAR EN JAVA------");
        //con var podemos declarar una variable que soporte
        //todo tipo de datos
        var variable = 10;
        var variable2 = "Hola";
        var variable3 = true;
        var variable4 = 2.0f;
        var variable5 = 'r';
        System.out.println("variable = " + variable);
        System.out.println("variable2 = " + variable2);
        System.out.println("variable3 = " + variable3);
        System.out.println("variable4 = " + variable4);
        System.out.println("variable5 = " + variable5);
        










    }
}