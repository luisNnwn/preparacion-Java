import java.util.Scanner;

public class forCiclo {

    public static void main(String[] args) {

        /*CICLO FOR*/
        /*
        * Esta estructura nos permite iterar o recorrer valores
        * por lo general recorre un arreglo, de numeros, cadenas
        * El arreglo: es una coleccion de varios datos, pero
        * del mismo dato.
        *
        * La forma para hacerlo es así
        *
        * for(int i=0; i <arreglo.length; i++) {
        *   el codigo que va a ir iterando
        * }
        *
        * cosas de esto...
        * - la gente ocupa i o j para los contadores, en realidad
        * a mi parecer no importa, con solo que sea descriptivo
        *
        * - el primer i = 0, es la posicion (si es un arreglo)
        * pero si es para un contador, solo es un numero de la que partimos en la
        * iteracion, generalmente es cero, pero podemos partir de un
        * valor en particular según necesite la logica de la solucion
        *
        * - luego viene una condicion, que i sea menor que la longitud
        * (length) del arreglo... esto puede ser un tanto distinto
        * porque ahí estamos usando la longitud de un arreglo
        * pero ahi puede ser la condicion menor, mayor, mayorigualque, menorigualque
        * de un determinado limite numerico que necesitemos.
        *
        * - por ultimo el i++, esto indica que queremos incrementar
        * en cada iteracion el valor de i, y este va a llegar hasta
        * la condicion de arriba, pero también podemos meterle a eso
        * i-- el cual decrementaria.. O sea lo podemos hacer con i++
        * para incrementar, o por el contrario le metemos (risas) un i--
        * que decrementa
        *
        * */
        System.out.println("CICLO FOR");

        /*EL CICLO DIARIO*/
        /*´Para poder practicar esto tome de referencia la manera en que pasa el tiempo
        * y como lo experimentamos o no dejando como conclusión la inevitable verdad de
        * que solo avanza y ya*/
        System.out.println("Vos tenes una maquina del tiempo que te ciñe la muñeca");
        System.out.println("Inconscientemente avanza, y si lo perdes te aprieta");
        System.out.println("Así que veamos que pasa dejandolo pasar");

        //instancio el scanner porque le voy a pedir al usuario que ingrese respuestas
        Scanner scanner = new Scanner(System.in);

        //este es mi contador, un i, que para nada representa al i de los
        //numeros imaginarios
        int i = 1;
        //esta es la variable que incialice vacia porque Java me pide inciailizarlas
        String afirmaNiega = "";
        //esta variable es solo porque necesitaba una para validar aparte de los dias en el while
        String deseo = "";
        System.out.println("Bienvenido a tu máquina del tiempo");

        //aca ocupe una doble condicion, ambas validan lo mismo
        //lo pude haber hecho solamente con el for pero para ir practicando el do while tambien
        do {
            //aca ocupo este insert para poder ejecutar el for y avanzar con los días
            System.out.println("¿Vos queres avanzar en el tiempo? (si/no)");
            afirmaNiega = scanner.nextLine();
            //este if es para validar que se responda si o no, aunque es indiferente, siempre se ejecuta el for
            //haciendo analogia a que siempre pasa el tiempo
            if (afirmaNiega.equalsIgnoreCase("si") || afirmaNiega.equalsIgnoreCase("no")){
                System.out.println("El tiempo no necesita de tus respuestas, solo avanza");
                //el for inicia en cero, contradictoriamente se detiene en un año, y aumenta hasta llegar a 365
                for (i = 1; i<=365; i++) {
                    //imprimo dia seguido de la impresion del contador
                    System.out.println("Dia: " + i);
                }
            } else {
                //muestro otro mensaje en el else
                System.out.println("Solo hay dos respuestas, querer o no querer");
            }
            //aca esto es solo para obtener el valor de la variable extra "deseo" que valido en el while
            System.out.println("¿Queres volver atras? (si/no)");
            deseo = scanner.nextLine();

        } while (deseo.equalsIgnoreCase("si"));
        System.out.println("No importa cuando leas esto, pasaste un año ya");


        /*
        * Recorrer tiempo
        * bucle ciclico veloz -
        * no mirar atras
        * */
    }

}
