import java.util.Scanner;

public class usoSwitch {

    public static void main(String[] args) {

        /*EL SWITCH
         *
         * Es para evaluar opciones, es mejor
         * que ir anidando un montón de if else
         *
         * Va así:
         *
         * //este valor se evalua
         * //cualquier tipo de valor
         * String diaSemana = "lunes"
         *
         * //dentro de switch evaluamos los diferentes
         * //casos y a partir de eso se ejecuta cierta
         * //sección del codigo
         * switch (diaSemana) {
         *   case "lunes"
         *       System.out.println("Hoy es lunes");
         *       break;
         *   case "jueves"
         *       System.out.println("Hoy es jueves");
         *       break;
         * //si no es ninguno de los casos
         * //se tiene un respuesta por defecto
         *   default;
         *       System.out.printlN("¿Qué dia es hoy")
         *
         * }
         * */

        int numeroDeEmergencia;
        int antiSpam = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("SWITCH");
        System.out.println("Consulta de numeros de emergencia: ");
        System.out.println("1. Proteccion Civil");
        System.out.println("2. Bomberos");
        System.out.println("3. Cruz Roja");
        System.out.println("4. Policia Nacional Civil");
        System.out.println("5. ISSS");
        numeroDeEmergencia = scanner.nextInt();

        switch (numeroDeEmergencia) {
            case 1:
                System.out.println("Protección Civil: 2281 0888");
                break;
            case 2:
                System.out.println("Bomberos: 913");
                break;
            case 3:
                System.out.println("Cruz roja: 2222 5155");
                break;
            case 4:
                System.out.println("Policia: 911");
                break;
            case 5:
                System.out.println("ISSS: 127");
                break;
            default:
                System.out.println("Ingrese una opción válida");

        }

        int numero;
        boolean naturalezaDelNumero;
        int parseo = 0;

        System.out.println("Ingrese el numero: ");
        numero = scanner.nextInt();

        if (numero % 2 != 0){
            naturalezaDelNumero = true;
            if (naturalezaDelNumero) {
                parseo = 1;
            }
        } else {
            naturalezaDelNumero = false;
            if (naturalezaDelNumero) {
                parseo = 0;
            }
        }

        switch (parseo){
            case 1:
                System.out.println("Numero impar");
                break;
            case 0:
                System.out.println("Numero par");
                break;

        }

    }
    /*
    * Sin iterarse
    * escoger opcion
    * satisfacerse
    * */
}
