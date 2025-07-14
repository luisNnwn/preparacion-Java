import java.util.Scanner;

public class forAnidados {

    public static void main(String[] args) {

        /*Se pueden anidar los for, sí, afirmativamente
         * efectivamente, claro que sí*/

        String planeta = "Pluton";

        /*Contador de intentos*/
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Es un Planeta del sistema Solar");
            planeta = scanner.nextLine();
            if (!planeta.equalsIgnoreCase("Pluton")) {
                for (int i = 10; i > 0; i--) {
                    for (int j = 1; i <=10; j++){
                        System.out.println("En el intento " + j + "escribiste: " + planeta);
                    }
                }
                    System.out.println("Te quedan " + i + "intentos");
            }
        } while (true);
    }

}
