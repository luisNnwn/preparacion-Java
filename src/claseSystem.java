import java.util.Map;

public class claseSystem {

    public static void main(String[] args) {

        /*La clase system ha servido para imprimir numeros
         * en pantalla, variable, strings
         *
         * Pero sirve también para obtener propiedades de la
         * computadora, la versión de java, carpeta raiz,
         * entre otras cosas.
         *
         * Esta declarada con final, así que no se puede instanciar
         * como un objeto, para usarla es igual que las clases anteriores
         * System.accederAMetodo()
         *
         * Es del paquete java.lang
         * */

        System.out.println("-----CLASE SYSTEM-----");

        //con esto podemos acceder al nombre del usuario de la computadora
        //con el metodo gerProperty y pasarle la propiedad que necesitamos saber
        String nombreUsuario = System.getProperty("user.name");
        System.out.println("Nombre del usuario = " + nombreUsuario);

        //directorio home
        String home = System.getProperty("user.home");
        System.out.println("Ruta de directorio home = " + home);

        //ruta del espacio de trabajo en el ide
        String workSpace = System.getProperty("user.dir");
        System.out.println("Espacio de trabajo = " + workSpace);

        //version de java
        String versionJava = System.getProperty("java.version");
        System.out.println("Version de Java = " + versionJava);

        //para ver las variables de entorno
        Map<String, String> variablesEntorno = System.getenv();
        System.out.println("variablesEntorno = " + variablesEntorno);

        String user = System.getenv("USERNAME");
        System.out.println("Nombre de usuario = " + user);
        
        String path = System.getenv("PATH");
        System.out.println("path = " + path);




    }

}
