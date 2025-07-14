import java.util.Scanner;

public class forAnidados {

    public static void main(String[] args) {

         /*Los for, son estructuras de control iterativas
        como ya se sabe.

        tenemos para ello la siguiente estructura:

        como ya describí anteriormente, la condición es
        que inicamos con un valor, lo iteramos incrementalmente
        o decrementalmente(o en cierta direccion si son matrices)
        y terminamos hasta que la condicíón se cumpla
        for (i=0; i==10; i++) {

            //DENTRO DE ACA VA LA LOGICA
        }

        Sin embargo, existen también los for anidados

        for (i=0; i<=4; i++){
            for (j=0; j<=4; j++) {
                System.out.println("El valor de j es = " + j + "mientras que el de i es = " + i);
            }
        }

        Los for anidados funcionan en este caso así, el for de adentro
        se ejecuta primero, luego el segundo, una vez que j, se ha ejecutado
        hasta cuatro, repite de nuevo porque empezo en cero, y debe repetir el
        ciclo para cada uno.

        Así, tendremos de salida en la consola que para cada numero de i, se realizara
        un ciclo con j hasta cumplir la condcion externa.

        Siendo la salida del código así:

            El valor de j es = 1 mientras que el de i es = 0
            El valor de j es = 2 mientras que el de i es = 0
            El valor de j es = 3 mientras que el de i es = 0
            El valor de j es = 4 mientras que el de i es = 0
            El valor de j es = 0 mientras que el de i es = 1
            El valor de j es = 1 mientras que el de i es = 1
            El valor de j es = 2 mientras que el de i es = 1
            El valor de j es = 3 mientras que el de i es = 1
            El valor de j es = 4 mientras que el de i es = 1
            El valor de j es = 0 mientras que el de i es = 2
            El valor de j es = 1 mientras que el de i es = 2
            El valor de j es = 2 mientras que el de i es = 2
            El valor de j es = 3 mientras que el de i es = 2
            El valor de j es = 4 mientras que el de i es = 2
            El valor de j es = 0 mientras que el de i es = 3
            El valor de j es = 1 mientras que el de i es = 3
            El valor de j es = 2 mientras que el de i es = 3
            El valor de j es = 3 mientras que el de i es = 3
            El valor de j es = 4 mientras que el de i es = 3
            El valor de j es = 0 mientras que el de i es = 4
            El valor de j es = 1 mientras que el de i es = 4
            El valor de j es = 2 mientras que el de i es = 4
            El valor de j es = 3 mientras que el de i es = 4
            El valor de j es = 4 mientras que el de i es = 4

        Comprendido el punto, voy a hacer un ejercicio con for anidados, en donde se muestre mi nombre, edad y cosas
        que se me vayan ocurriendo, remitiendome a la metodología de los actores del metodo, ser y actuar como ese personaje,
        pensarlo, entenderlo. Así que a continuación este ejercicio
        */

        System.out.println("SIENDO UN ACTOR DEL METODO: SOY UN FOR ANIDADO");


        String nombre = " ";

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("|Un actor del metodo es aquel que utiliza tecnica de actuacion    |");
        System.out.println("|Basadas en la profunda inmersion en el personaje                 |");
        System.out.println("|Utilizando sus propias experiencias y emociones para crear       |");
        System.out.println("|Interpretaciones mas autenticas y realistas                      |");
        System.out.println("-----------------------------------------------------------------");

        System.out.println("Quiero que ingreses tu nombre para que seas un for anidado: ");
        nombre = scanner.nextLine();

        //empezamos con la variable año, esta va a ir de 1999 incrementandose hasta 2025
        for (int anio = 1999; anio<=2025; anio++){
            System.out.println("Hola " + nombre + " en el " + anio);
            //en el for interno solo tenemos un contador, que por cada iteracion mostrara un mensaje
            for (int i = 1; i<=5; i++){
                System.out.println(i + " No sabías que ibas a ser un for anidado");
            }
        }
        System.out.println("Y cada vez que piensas en sacar cuentas de esto eres un for");
        System.out.println("Tu mente ejecuta un for");

        //esto no tiene una historia en sí, pero es para comprender mentalmente como operan
        //los for anidados, hay que saber como actuan
             /*El for de adentro debe completar siempre un ciclo completo con cada condicional
             del for de afuera*/

             /*
             Anidarse, ser
             entender todo ciclo
             y repetirse
             */


    }

}
