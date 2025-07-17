import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {

        /*El ciclo dowhile o el hacer mientras
         *
         * Es como el while, pero se diferencia en que
         * el while se puede no ejecutar debido a que no se
         * cumpla la condición; en cambio, el do while, se ejecuta
         * al menos una vez y luego evalua la condicion
         *
         * Es mas o menos así:
         * boolean condicion = true or false;
         *
         * do {
         *
         * el codigo que se va a ejecutar al menos una vez
         *
         *
         * }hasta que se cumpla cierta condicion
         *  while (condcion)
         *
         * */

        /*
        * ejemplo guia:
        *  C1V1=C2V2
        * C1 = concentracion inicial //se pide int concentracionActual
        * v1 = volumen del acido a usar //necesito pedirlo int volumenAcidoUsar;
        * c2 = concentracion deseada //yo la doy en el enunciado
        * v2 = volumen final total //lo calculo int volumenFinal;
        *
        * ejemplo 100 ml de acido al 90%
        *
        * 90 * 100 = 10 * v2
        * 9000 = 10 *v2
        * v2 = 900ml
        *
        * agua = 900 - 100 = 800 //lo calculo con los resultados obtenidos
        *         v2 - vi
        *
        *
        * */

        System.out.println("UN DO WHILE QUE DILUYE ACIDO CLORHIDRICO");

        boolean estaDiluido = false;
        int concentracioActual = 0;
        int volumenAcidoUsar = 0;
        int volumenFinal;
        int aguita = 0;
        String formula = "";
        String [] diluciones = {"Preparar HCL al 20%", "Preparar HCL al 15%"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay mucho HCL a su disposición");
        System.out.println("Prueba diluyendolo en distintas proporciones");
        System.out.println("Cosas que tienes que saber:");
        System.out.println("1. La concentración inicial es el grado en que el acido está concentrado en el liquido (agua)");
        System.out.println("2. Necesitas el volumen del acido que vas a usar");
        System.out.println("3. Se te proporcionara la concentracion deseada");
        System.out.println("4. Necesitas encontrar el volumen final total");

        do {
            System.out.println("Dilucion de HCL");
            //imprimo el primer elemento del arreglo de strings
            System.out.println(diluciones[0]);
            //solicito la concentracion actual del acido (obtengo c1)
            System.out.println("Ingrese la concentración actual de su acido");
            concentracioActual = scanner.nextInt();
            scanner.nextLine();
            //ahora solicito  la los ml de acido que se van a usar (obtengo v1, y ya tengo c1, v1)
            System.out.println("¿Cuántos ml de ácido usará? ");
            volumenAcidoUsar = scanner.nextInt();
            scanner.nextLine();
            //En el enunciado doy la concentración dos, la cual es la concetracion final a la que quiero llegar
            //ahora calculo el volumen final porque me va a servir para poder calcular el agua a agregar
            volumenFinal = (concentracioActual * volumenAcidoUsar) / 20; //20 es la concentracion que quiero lograr
            //una vez tengo el volumenFinal del Acido, puedo calcular el agua a agregar con la variable aguita
            aguita = volumenFinal - volumenAcidoUsar;
            System.out.println("El agua que debe agregar a su HCL al " + concentracioActual + "%" + " para que llegue al 20% "  +" es " + aguita + "ml.");



            System.out.println("¿Qué formula se uso para hacer este calculo");
            formula = scanner.nextLine();
            if (formula.equalsIgnoreCase("C1V1=C2V2")){
                System.out.println("Correcto");
                estaDiluido = true;
            } else {
                System.out.println("Intentalo de nuevo");
            }

        }while(!estaDiluido);
    }

    /*
    * Diluir codigo
    * agua dar al acido
    * finalizarlo
    * */

}
