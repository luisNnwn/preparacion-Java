import java.sql.SQLOutput;
import java.util.Scanner;

public class whileCiclo {

    public static void main(String[] args) {

        //WHILE
        /*Nos ayuda a repetir una estructura de codigo
         * de acuerdo con una determinada condicion
         *
         * Otsea, se va a repetir siempre y cuando se cumpla
         * esa condición
         *
         *La condición tiene que ver con una variable que se
         * va a modificar dentro del ciclo, o sea, tenemos que
         * hacer algo con esa variable
         * La forma es así:
         * while (opcion) {
         * condicion = false;
         * }
         * Si no, se va a ejecutar hasta topar la memoria
         *
         *
         * */

        /*El objetivo de esto fue usar un while explicando una reacción quimica*/
        System.out.println("-----WHILE-----");
        System.out.println("Reacción entre Sodio y Fluor");
        /*Aca tengo dos variable booleanas, una que es para decir que pierden y la otra
        * que ganan electrones... esto lo uso al final, porque tengo un while anidado en un
        * do while*/
        boolean naPierdeElectron = false;
        boolean fGanaElectrones = false;
        /*Estas son respuestas a las preguntas, las incialice vacías porque en Java, hay que
        * inicializar las variables y sirven de control en un if*/
        String respuestaNaE = "";
        String respuestaFE = "";
        //carga positiva: este es un estado que le doy al elemento quimico, luego de
        //escribir la palabra correcta
        boolean isCation = false;
        //carga negativa: lo mismo que arriba
        boolean isAnion = false;
        //esto me sirve para decirle al usuario si la carga es positiva o negativa
        //en función de si es un anion o cation y que anteriormente se haya tenido
        //la respuesta correcta
        String carga1 = "Positiva";
        String carga2 = "Negativa";

        //el scanner
        Scanner scanner = new Scanner(System.in);

        /*Aca empiezo con el while... yo valido que sea cation o no, y solo se repite si queda en estado falso*/
            while (isCation == false && isAnion == false) {
                System.out.println("El Na y F aparecen en tus manos (imaginatelo)");
                System.out.println("Tienes la oportunidad de ceder electrones o no");
                do {
                    System.out.println("¿Quieres que el Sodio (Na) ceda un electron (Si: ceder)?");
                    //el estado depende practicamente de ingresar la palabra correcta
                    //si se cede un electron pues entonces es un cation
                    respuestaNaE = scanner.nextLine();
                    //aca esta, yo cedo un electron y isCation se vuelve true
                    if (respuestaNaE.equalsIgnoreCase("Ceder")) {
                        System.out.println("El Na, le ha cedido un elctron al fluor");
                        //se vuelve true y se valida la primera condicion para cerrar el ciclo
                        isCation = true;
                        //y si es true, pues se muestra este mensaje, diciendo la accion realizada
                        //mostrando la carga y también cambiando el estado de naPierdeElectro, o sea
                        //el sodio pierde un electron
                        if (isCation) {
                            System.out.println("Creaste el catión Na+, el sodio cedio un electron");
                            System.out.println("Carga: " + carga1);
                            //cambiar el valor de esta variable a través de validar el estado de isCation
                            //me sirve para repetir el ciclo del do while
                            //el valor de esta ultima depende de isCation entonces, dicha variable
                            //es más para que el usuario sepa la carga y esta para repetir
                            naPierdeElectron = true;
                        }
                    } else {
                        //si la respuesta es unica y detergente a la que se esperaba pues se le dice al usuario
                        //para que revise al repetirse el ciclo, aunque ahora que lo pienso pude
                        //haber repetido esto hasta que se aceptara, pero ni modos, ya lo termine y funciona
                        System.out.println("Escribe la accion correcta necesaria");
                    }

                    //aca vuelvo a lo mismo, pregunto y digo la palabra que se debe ingresar para hacer la accion adecuada
                    //y finalizar formando un compuesto quimico
                    System.out.println("¿Quieres que el Fluor (F) acepte el electron un electron (Si: aceptar)?");
                    respuestaFE = scanner.nextLine();
                    //si la respuesta es aceptar cambio el valor de isAnion, porque acepto un electron y cambio su carga
                    if (respuestaFE.equalsIgnoreCase("Aceptar")) {
                        System.out.println("El F, ha aceptado un electron al Sodio");
                        isAnion = true;
                        //si es true aca ya completo la secuencia para que se termine el while de fuera
                        if (isAnion) {
                            //y consecuentemente se informa al usuario la accion y se informa la carga
                            System.out.println("Creaste el anion F-, el sodio  te cedio un electron");
                            System.out.println("Carga: " + carga2);
                            //y se cambia el valor a true de esta variable para que salga del do while también
                            fGanaElectrones = true;
                        }
                    } else {
                        //si es unica y detergente la respuesta pues se le dice al usuario, claramente se les dice a las...
                        System.out.println("Escribe la accion correcta necesaria");
                    }
                    //aca se valida que si son falsas estas condiciones se repitan las preguntas
                } while (naPierdeElectron == false && fGanaElectrones == false);
            }

            //el final: un resumen del compuesto y sus caracteristicas
            //esto es de un proyecto que nunca inicie sobre formacion de compuestos quimicos
            System.out.println("Felicidades creaste Fluoruro de Sodio");
            System.out.println("Caracteristicas:");
            System.out.println("* Reaccion exotermica: libera mucha calor");
            System.out.println("* Es un sólido blanco cristalino, soluble en agua");

            /*
            * Hacer quimica -
            * mientras sea bien hecha
            * o reevaluarse
            * */

    }

}
