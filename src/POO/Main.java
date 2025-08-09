package POO;

public class Main {

    public static void main(String[] args) {

        /*Desde acá pódemos acceder al objeto persona
        * y le damos los parametros según el constructor*/
        Persona persona1 = new Persona("Luis", 26);
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad = " + persona1.getEdad());

        /*Luego se puede cambiar el valor de los atributos así:*/
        persona1.setNombre("Paola");
        persona1.setEdad(28);

        System.out.println("El nombre es: " + persona1.getNombre() + " y tiene: " + persona1.getEdad());

    }

}
