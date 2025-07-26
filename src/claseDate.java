import java.text.SimpleDateFormat;
import java.util.Date;

public class claseDate {

    public static void main(String[] args) {

        /*La clase date nos permite manipular las fechas
        * en Java, se debe instanciar como un objeto normal
        *
        * Esta dentro del paquete java.util
        *
        * Hay otra clase Date, en paqueta java.sql*/

        //se instancia como un objeto
        Date fecha = new Date();
        //al no pasarle ningun parametro nos imprime la fecha
        //y hora actual, con solo crear el objeto
        System.out.println("fecha = " + fecha);

        /*Pero se le puede dar un formato especifico
        * A traves de la clase SimpleDateFormat
        * */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
        String fecha2 = sdf.format(fecha);
        System.out.println("Fecha con formato = " + fecha2);

    }

}
