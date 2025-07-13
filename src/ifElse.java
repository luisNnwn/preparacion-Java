import java.sql.SQLOutput;
import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {

        //ESTRUCTURAS DE CONTROL

        //if else
        //permite validar condiciones o datos
        System.out.println("-----IF ELSE-----");
        //se usa la palabra reservada if,
        /*
         * Estructura:
         * if (condicion) {
         * se ejecuta el codigo si se cumple
         * la condicion
         * } else {
         * se ejecuta el codigo si no se cumple la condicion
         * }
         *
         * o también se puede agregar un else if, para ir analizando
         * varias condiciones
         *
         * No es obligatorio usar else, se puede dejar solo con
         * if, de acuerdo con las necesidades
         * */

        //aca inicializo la calificacion porque Java pide que inicialice la calificación
        //y de todos modos el valor lo ingresa el usuario
        int calificacion = 0;
        //aca ocupo dos booleanos, isApproved que sirve para mostrar el estado
        //esto se puede ocupar más adelante si fuese más grande el programa, pero sirve
        //para mostrar el estado del alumno. Por otra parte calificando, me sirve aca
        //para poder saber si el usuario está calificando, y esto depende de si
        //el usuario quiere ingresar una calificacion
        boolean isApproved, calificando;
        //ocupe el char respueta para poder usarlo como entrada de S o N de la primera pregunta
        //si es S, entremos en el do, sino, se termina la ejecución y calificando toma el valor
        //de false y se sale porque calificando es distinto de true
        char respuesta;
        //esto solo es para ir mostrando la cantidad de alumnos que se van calificando
        int numeroAlumno = 1;
        //esto lo ocupe para poder ocupar el metodo equalsIgnoreCase y comparar la respuesta
        //y si y solo si se sale del bucle si la palabra es exit. Aunque el metodo equalsIgnoreCase
        //es como la doctora Polo:
        /*No me importa tu raza o tu sexo
¿Por qué hablar de eso? y ni de donde vengas
En el momento en que te haga falta
Que tengas un problema y no veas el final del túnel
La luz que te alumbra y te ayuda a salir del dilema
Ése es mi lema, what's up, baby?
Aquí siempre, aquí haciendo

La cosa se explica porque a ese metodo no le importa si es mayuscula o minuscula
si es igual a la palabra. Na mas lo puse para eso*/
        String salir = "exit";

        //abro el scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE CALIFICACIONES");
        //pregunto si quiere ingresar una calificacion
        System.out.print("¿Desea ingresar una calificacion? (S/N)");
        respuesta = scanner.next().charAt(0);
        //importante limpiar con esto, porque luego tenía otro input y no funcionaba bien
        scanner.nextLine();
        //si la respuesta es S entra en el do
        if (respuesta == 'S') {
            //cambia el valor de calificando a true
            calificando = true;
            do {
                //pregunto la calificacion
                System.out.print("Ingrese la calificacion: ");
                calificacion = scanner.nextInt();
                scanner.nextLine();


                //una vez ingresada la calificacion, se evalua
                //sobre que condicion recae la naturaleza del numerito
                //y se le asigna si esta aprobado, la clasificacion en letra
                //el numero de alumno y el estado del alumno
                if (calificacion >= 90) {
                    System.out.println("Aprobado");
                    isApproved = true;
                    System.out.println("A");
                    System.out.println("Estado de " + "alumno número " + numeroAlumno + " es: " + isApproved);
                } else if (calificacion >= 80) {
                    System.out.println("Aprobado");
                    isApproved = true;
                    System.out.println("B");
                    System.out.println("Estado de " + "alumno número " + numeroAlumno + " es: " + isApproved);
                } else if (calificacion >= 60 && calificacion < 80) {
                    System.out.println("Aprobado");
                    isApproved = true;
                    System.out.println("C");
                    System.out.println("Estado de " + "alumno número " + numeroAlumno + " es: " + isApproved);
                } else if (calificacion >= 40 && calificacion < 60) {
                    System.out.println("Reprobado");
                    isApproved = false;
                    System.out.println("D");
                    System.out.println("Estado de " + "alumno número " + numeroAlumno + " es: " + isApproved);
                } else {
                    System.out.println("Reprobado");
                    isApproved = false;
                    System.out.println("F");
                    System.out.println("Estado de " + "alumno número " + numeroAlumno + " es: " + isApproved);
                }
                //una vez se ha impreso la informacion, se pregunta
                //si se quiere salir del programa
                System.out.println("¿Desea salir?");
                salir = scanner.nextLine();
                //aca se evalua con el equalsIgnoreCase y si
                //es igual a exit, se cambia el estado de calificando a false
                //y se sale del do, porque se ejecuta siempre y cuando calificando sea true
                if (salir.equalsIgnoreCase("exit")) {
                    calificando = false;
                } else {
                    //si no se ingresa exit, se aumenta el numero de alumno
                    //aca se incrementa el valor de la variable, que la inicie
                    //en uno
                    numeroAlumno++;
                }
                //y esta es la calificacion que determina si se ejecuta
                //el do, o no, mientras no cambie de true, pos se sigue ejecutando
            } while (calificando);

            /*
            * Hacer acciones
            * al ordenarse hacer
            * o fin a todo
            * */
        }
    }
}
