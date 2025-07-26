import java.util.Random;

public class claseMath {

    public static void main(String[] args) {

        /*CLASE MATH
         * Es una clase matemática con metodos para programar
         *:
         * -raiz
         * -valmax
         * -valmin
         * -cos
         * etc
         *
         * No se pueden crear objetos de esta clase, sino que
         * hay que colocar el nombre de la clase MATH y con el
         * punto accedemos a los metodos de la clase
         * */

        /*Sobre la clase math: Las clases que tienen la palabra final quiere decir
         * que no es una clase de la cual se puedan crear objetos y ademas
         * todos los metodos son static, por lo que no es necesario
         * crer un objeto para acceder a ellos*/
        //podemos darle el valor directamente de un valor
        //absoluto.. para usarlo escribimos el nombre de la clase
        //y accedemos con el punto al metodo que necesitamos
        System.out.println("-----VALOR ABSOLUTO-----");
        int valorAbsoluto = Math.abs(-30);
        System.out.println("El valor absoluto de -30" + valorAbsoluto);

        /*Podemos usar el metodo max o min, para comparar dos números
         * y se obtiene el numero máximo entre dos números, que pueden ser
         * de distinto tipo*/
        System.out.println("-----VALORES MAXIMO Y MINIMO-----");
        int maximo = Math.max(20, -20);
        System.out.println("El valor máximo entre 20 y -20 es: " + maximo);

        double minimo = Math.min(3.1450, 3.14509);
        System.out.println("El valor minimo entre 3.154 y 3.15420 es: " + minimo);

        System.out.println("-----REDONDEO HACIA ARRIBA O HACIA ABAJO-----");
        /*Tambien el metodo math sirve para poder redondear numeros
         * hacia arriba o hacia abajo*/
        //para redondear hacia arriba se usa el metodo ceil y floor
        //hacia abajo
        double redondeoArriba = Math.ceil(5.6);
        System.out.println("Redondeado hacia arriba: " + redondeoArriba);

        double redondeoAbajo = Math.floor(5.6);
        System.out.println("Redondeado hacia abajo: " + redondeoAbajo);

        //tambien se puede redondear con el metodo round, por ejemplo
        //la constante de euler, las constantes no se pueden modificar
        //en la clase se definen con static y finally, por lo que no
        //se pueden modificar
        long redondeo = Math.round(Math.E);
        System.out.println("Euler redondeado: " + redondeo);

        System.out.println("-----LOGARITMO DE UN NUMERO-----");

        //se puede sacar el logaritmo de un numero con el metodo log
        //pero retorna double, así que debe aplicarse a variables double
        double logaritmo = Math.log(10);
        System.out.println("El logaritmo de 10 es: " + logaritmo);

        //tambien se puede sacar la raiz cuadrada de un numero
        //pero retorna double tambien
        double raizCuadrada = Math.sqrt(25);
        System.out.println("La raiz cuadrada de 25 es: " + raizCuadrada);

        System.out.println("-----RANDOM-----");
        /*El metodo random nos devuelve un numero "aleatorio"
         * entre 0 y 1*/
        double numeroRandom = Math.random();
        System.out.println("Un numero random: " + numeroRandom);

        /*Investigando, hay una formula para poder obtener numeros
         * aleatorios enteros determinados por un rango
         *
         * //definimos dos enteros
         * int min = 5;
         * int max = 10;
         *
         * //la formula
         * int aleatorio = (int)(Math.random() * (max - min + 1)) + min;
         * --Primero con math.random() obtenemos el numero aleatorio
         * --Luego se hace max - min + 1 que nos da los valores posibles
         * se suma uno porque se incluyen los extremos de valores posibles
         * --Se multiplica el numero decimal por la cantidad de valores, para ampliar
         * el rango de valores, al multiplicar según se ve da un numero entre el cero y
         * el valor minimo y al sumar cinco se lleva ese valor a un numero
         * que está dentro del rango deseado
         * --Se convierte el decimal a entero
         * --y se le suma el valor minimo
         * */
        int min = 5;
        int max = 10;
        int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Aleatorio: " + aleatorio);

        //También hay una clase random que no es de Math
        //sino de java.utils., así que se crea como un objeto
        Random random = new Random();
        //aunque con esto es más fácil hacerlo jjaj
        //aca imorimo un numero random del 0 al 10
        int randomEntero = random.nextInt(10);
        System.out.println("randomEntero = " + randomEntero);



    }
}
