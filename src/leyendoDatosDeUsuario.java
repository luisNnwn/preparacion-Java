import java.util.Scanner;

public class leyendoDatosDeUsuario {

    public static void main (String args[]) {

        String nombre;
        String apellido;
        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = scanner.nextLine();
        System.out.println("Ingresa tu edad: ");
        edad = scanner.nextInt();

        System.out.println("|----------DATOS DEL USUARIO----------|");
        System.out.println("| Nombre: " + nombre + "              |");
        System.out.println("| Apellido: " + apellido + "          |");
        System.out.println("| Edad: " + edad + "                  |");
        System.out.println("|-------------------------------------|");



    }
}
