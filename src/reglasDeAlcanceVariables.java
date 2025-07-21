public class reglasDeAlcanceVariables {

    //esta variable de clase la puedo ocupar en cualquier
    //metodo de la clase
    String apellido = "un nombre";


    public String holaMundo (String nombre) {
        //este solo existe dentro de este metodo
        String apellido = "otro apellido";
        System.out.println("Hola: " + nombre);
        //aca usamos la variable del metodo
        return nombre+apellido;
        //pero también podemos usar la variable de clase
        //hacemos uso de la variable de clase con la palabra this
        //return nombre+this.apellido;
    }

    public void obtenerApellido() {
        System.out.println("apellido" + apellido);
    }
}
