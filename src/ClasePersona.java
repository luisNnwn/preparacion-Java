public class ClasePersona {

    /*Las clases son plantillas con atributos y metodos
     *
     * los atributos son los campos o variables de la clase
     *
     * los metodos son las cosas que hace la clase
     *
     * Es así:
     *
     * public class FiguraGeometrica {
     *
     * //atributos
     * private int numeroLados;
     * private int area;
     *
     * //metodos
     * public int getArea(){}
     *
     * }
     *
     * importante: el nombre de la clase (Archivo) debe ser igual
     * al nombre que se le coloca en la decalración de la clase
     * */

    //el modificador de acceso private nos permite
    //accede a los atributos solo desde esta clase
    private String nombre;
    private int edad;
    private String sexo;

    /*CONSTRUCTOR
    * Es un metodo que nos permite crear un objeto, el nombre
    * del constructor tiene el mismo nombre que el de la clase
    * se puede declarar así explicitamente o implicitamente
    * otsea, a veces se puede no crearlo, java crea uno
    * pero vacio
    *
    * Esto es un constructor
    *
    * le pasamos de parametros todos los atributos de la clase
    * public Persona (String nombre, int edad, String sexo) {
    *   this.nombre = nombre;
    *   this.edad = edad;
    *   this.sexo = sexo;
    *
    * }
    * */

    public ClasePersona() {
        //este es el constructor que hace java
        //pero de manera explicita
    }

    //esto esta sobreescribiendo el metodo constructor que
    //ya genera Java por defecto
    public ClasePersona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    /*Contexto: un atributo es una variable que pertenece a la clase
    * un parametro es una variable temporal que usamos dentro
    * de un metodo y que se declara entre los parentesis del metodo
    *
    * 1. Creamos un objeto 
    * Persona p = new Persona();
    * 
    * 2. El objeto tiene cosas guardadas, lo que se guarda ahí son los
    * atributos
    * Public class Persona {
    *   String nombre; --> esto es un atributo y esta dentro del objeto
    * }
    *
    * 3. Tenemos el siguiente metodo:
    * public void setNombre (nombre) // este nombre es el parametro
    * //es lo que se da cuando se llama al metodo, o sea p.setNombre("Guadalupe"), ese
    * //valor que se le asigna va al parametro nombre{
    *
    * entonces la linea esta lo que hace es que el nombre que tiene esa
    * persona va a ser igual al que se le mando como parametro
    *   this.nombre = nombre;//esto es el atributo de la clase
    * }
    * */

    //los metodos set no devuelven nada, por eso se usa void
    //El nombre del parentesis es un parametro que se le pasa
    //desde fuera para ponerselo al objeto...
    //luego this.nombre es el atributo del objeto
    //entonces, al atributo que tiene el objeto: this.nombre
    //se le asigna el valor que le acaban de pasar como parametro

    public void setNombre (String nuevoNombre) {
        //aca el primer "nombre es el atributo de la clase"
        //el segundo "nombre es el parametro del metodo"
        nombre = nuevoNombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //el set mete cosas en la caja, y por lo tanto
    //necesita recibir algo como parametro
    //el get saca cosas de la caja, solo trae lo que ya esta
    //guardado

    //METODOS DE LA CLASE
    public boolean mayorDeEdad (ClasePersona persona) {
        if (persona.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }


}
