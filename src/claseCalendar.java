import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class claseCalendar {

    public static void main(String[] args) {

        /*Esta es otra clase que nos permite ocupar fechas*/
        Calendar calendar = Calendar.getInstance();
        //nos permite setear fechas anteriores
        calendar.set(2019, 1, 25);
        //ahora usamos la clase date para obtener la fecha del calendario
        //se obtiene la fecha a través de getTime
        Date fecha = calendar.getTime();
        System.out.println("fecha = " + fecha);

        /*También a los objetos calendario les podemos ir seteando
        * diferentes valores de esta manera*/
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.YEAR, 2015);
        calendar1.set(Calendar.MONTH, 0);
        calendar1.set(Calendar.DAY_OF_MONTH, 30);
        calendar1.set(Calendar.HOUR, 4);
        calendar1.set(Calendar.AM_PM, Calendar.AM);
        calendar1.set(Calendar.MINUTE, 15);
        calendar1.set(Calendar.SECOND, 59);
        
        Date fecha2 = calendar1.getTime();
        System.out.println("fecha2 = " + fecha2);

        /*Y bueno así ya vamos viendo la estructura a seguir para
        * hacer esto:
        * 1. Creamos una instancia de Calendar
        * 2. Le seteamos los diferentes valores
        * 3. Creamos una variable de tipo Date, y con el objeto
        * con valores seteados accedemos a los datos con el metodo
        * getTime
        * 4. Luego creamos un objeto SimpleDateFormat para darle formato,
        * especificando el formato a seguir
        * 5. Creamos una variable para darle ese formato a una fecha
        * 6. Se muestra*/

        //Pero siempre le podemos dar formato creando un objeto SimpleDateFormat
        //especificandole el formato, creando una variable en la cual le aplicamos
        //el formato a la fecha
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String fechaConFormato = formato.format(fecha2);
        System.out.println("fechaConFormato = " + fechaConFormato);



    }

}
