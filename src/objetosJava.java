public class objetosJava {

    public static void main(String[] args) {


    /*Un objeto es una instancia de una clase
    *
    * O sea, algo que representa a la clase...
    *Cuando uno crea un objeto tiene acceso a todos
    * los atributos o metodos dentro de la clase
    *
    * Para declarar objetos se usa la palabra new
    *
    * Por ejemplo para ClasePersona
    *
    *       ClasePersona     persona           =    new      ClasePersona();
    * (tipo de la clase)    identificador          el new       hacemos referencia al
    *                       nombre del objeto       sí          constructor de la clase
    *
    *también se pueden crear objetos dandole los valores de los atributos
    * estos tienen que coincidir con los parametros que tiene el constructor
    * ClasePersona persona = new ClasePersona("Mariano", 45, "Masculino");
    *
    * Y podemos acceder a los metodos de la clase a través del punto
    *
    * persona.getEdad();
    * persona.gerNombre();
    *
    *
    *
    * */

        System.out.println("CREACION DE OBJETOS");

        ClasePersona objetoPersona = new ClasePersona();
        objetoPersona.setNombre("Mariano");

        ClasePersona objetoPersona2 = new ClasePersona("Jacinto", 23, "Masculino");

        String nombre = objetoPersona.getNombre();
        objetoPersona.setEdad(36);
        int edad = objetoPersona.getEdad();
        objetoPersona.setSexo("Masculino");
        String sexo = objetoPersona.getSexo();

        System.out.println("objetoPersona = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("sexo = " + sexo);

        System.out.println("Datos persona 2." + " Nombre: " + objetoPersona2.getNombre() + " Edad: " + objetoPersona2.getEdad() + " Sexo: " + objetoPersona2.getSexo());
        //aca tengo que pasarle un objeto, porque el metodo recibe de parametro
        //un objeto
        boolean esMayorDeEdad = objetoPersona2.mayorDeEdad(objetoPersona2);
        System.out.println("Mayor de edad: " + esMayorDeEdad);

        /*METODOS Y CLASES DE API JAVA*/
        System.out.println("METODOS Y CLASES DE API JAVA");
        System.out.println("CLASE MATH");

        System.out.println("Clase Math" + Math.sqrt(4));
        System.out.println("Valor minimo: " + Math.min(10, 40));

        /*Los packages sirven para estructurar el proyecto
        * en carpetas, aca no lo he usado todavia */


    }


}
