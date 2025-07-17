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

        System.out.println("UN DO WHILE QUE DILUYE ACIDO CLORHIDRICO");

        boolean estaDiluido = false;
        int concentracionDeseada = 0;
        int volumenAcido = 0;
        int volumenFinalTotal1 = 0;
        int volumenFinalTotal2 = 0;
        int aguita = 0;
        String [] diluciones = {"HCL al 20%", "HCL al 15%"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay mucho HCL a su disposición");
        System.out.println("Prueba diluyendolo en distintas proporciones");
        System.out.println("Cosas que tienes que saber:");
        System.out.println("1. La concentración inicial es el grado en que el acido está concentrado en el liquido (agua)");
        System.out.println("2. Necesitas el volumen del acido que vas a usar");
        System.out.println("3. Se te proporcionara la concentracion deseada");
        System.out.println("4. Necesitas encontrar el volumen final total");

        do {
            for (String ejercicio: diluciones) {
                System.out.println(diluciones[0]);
                System.out.println("Ingresa el volumen en el que vas a diluir el acido");
                volumenAcido = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingresa la concentracion deseada: ");
                concentracionDeseada = scanner.nextInt();
                scanner.nextLine();
                volumenFinalTotal1 = ((20 * volumenAcido) / 20);
                aguita = volumenFinalTotal1 - volumenAcido;
                System.out.println("El agua a añadir es: " + aguita + " ml.");

                System.out.println(diluciones[1]);
                System.out.println("Ingresa el volumen en el que vas a diluir el acido");
                volumenAcido = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingresa la concentracion deseada: ");
                concentracionDeseada = scanner.nextInt();
                scanner.nextLine();
                volumenFinalTotal2 = ((20 * volumenAcido) / 20);
                aguita = volumenFinalTotal1 - volumenAcido;
                System.out.println("El agua a añadir es: " + aguita + " ml.");

                estaDiluido = true;
            }
        } while (estaDiluido ==false);
    }

}
