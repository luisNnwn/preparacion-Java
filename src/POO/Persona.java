package POO;

public class Persona {

    /*Practica de encapsulamiento:
    * Usamos el modificador de accedo private, el cual hace que estos atributos
    * sean accedibles solo desde esta clase*/
    private String nombre;
    private int edad;


    //sobreescribe el constructor que se crea por defecto
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /*si bien los atributos son privados, podemos acceder a la implementación de estos
    * a través de los métodos públicos get y set*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        /*this diferencia el atributo que viene como parametro
        * y el nombre del atributo de la clase*/
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*ESTO ES UNA CLASE CON ATRIBUTOS ENCAPSULADOS QUE SE EXPONEN A TRAVÉS DE MÉTODOS
    * PÚBLICOS*/
}
