public class ejecucionDeProgramaSystem {

    public static void main(String[] args) {

        /*Este ejercicio es sobre como abrir una aplicaicon
        * del sistema operativo*/
        
        //obtenemos el sistema operativo del equipo
        String sistemaOperativo = System.getProperty("os.name");
        System.out.println("sistemaOperativo = " + sistemaOperativo);

        //ahora la declaracion de objetos

        /*El objeto runtime nos permite ejecutar un programa
        * del sistema operativo*/

        //con esto asignamos al objeto instanciado
        //a la variable runtime...
        //RUNTIME NOS PERMITE DECIRLE AL SO DESDE JAVA
        //LO QUE TIENE QUE HACER
        /*Lo que hace es retornar la instancia de un runtime*/
        Runtime rt = Runtime.getRuntime();
        //ahora ocupamos la clase process, es de java.lang

        Process proceso;
        try {
            if (sistemaOperativo.startsWith("Windows")){
                //proceso de la clase process nos sirve para poder
                //almacenar procesos
                /*Acá por ejemplo abro el cmd, /c ejecuta el comando cmd
                * /k sirve para poder ejecutar el comando ipcofig
                *
                * A proceso se le asigna el valor de runtime usando el metodo exec
                * y dandole un comando*/
                //ACA SE LE DAN LAS INSTRUCCIONES
                proceso = rt.exec("cmd /c start cmd /k ipconfig");
            } else {
                proceso = rt.exec("Notepad");
            }
        } catch (Exception e){
            //obtenemos el error
            System.err.println("Error" + e.getMessage());
        }



    }

}
