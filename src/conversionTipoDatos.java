public class conversionTipoDatos {

    public static void main (String args[]) {

        System.out.println("-----CONVERSION DE CADENA DE TEXTO A PRIMITIVOS------");
        //el string es un objeto que maneja cadenas
        String cadena = "40";
        //ahora voy a convertir el String a numero
        //basicamente la sintaxis para hacer converiones es así
        /*Tenemos primero la variable que queremos convertir
         * String edad = "40"; --aunque nadie guardaría una edad así, creo
         * luego declaramos otra variable del tipo al que queremos convertir
         * int numero
         * y el valor va a ser Integer (o Double, o Float o cualquier otro
         * numérico, y usaremos el metodo parseInt, y le pasamos
         * la variable que queremos convertir. Así
         * int numero = Integer.parseInt(edad);
         * y así se convierte
         * */
        int numero = Integer.parseInt(cadena);
        System.out.println("Cadena convertida = " + numero);

        String numeroDouble = "40.2f";
        double doubleConvertido = Double.parseDouble(numeroDouble);
        System.out.println("doubleConvertido = " + doubleConvertido);

        String cadenaBooleana = "False";
        boolean booleanConvertido = Boolean.parseBoolean(cadenaBooleana);
        System.out.println("booleanConvertido = " + booleanConvertido);


        System.out.println("-----METODOS toString() y valueOf()------");
        //ahora vamos a convertir de numeros a cadenas

        int a = 10;
        //para realizar la conversion es lo mismo que la explicacion anterior
        /*Primero, tenemos una variable, la que queremos convertir,
        * entonces creamos una variable String
        * String conversion
        * Luego le asignamos el valor usando y usando
        * el metodo toString()
        * String.toString
        * String conversion = Integer.toString(variableInt)
        * Solo hay una diferencia, al asignar el valor convertido
        * no se usa String, sino el tipo de valor al que se convierte
        * el String
        * y pos ya queda*/
        String conversion = Integer.toString(a);
        System.out.println("Integer a String, usando clase Integer y toString() = " + conversion);

        //también está el metodo valueOf()
        String conversion2 = String.valueOf(a);
        System.out.println("Integer a String usando clase String y value of: " + a);


        System.out.println("-----CASTING EN TIPOS DE DATOS------");
        //ahora vamos a convertir de una dato primitivo a otro dato primitivo
        int a1 = 223;
        //para convertir este tipo int a short
        //se podría intentar simplemente asignar el valor
        //short a2 = a1; PERO NO SE PUEDE PORQUE SON TIPOS DE DATOS DISTINTOS
        //entonces se hace la conversion
        
        //la sintaxis sería así:
        /*Tenemos una variable que queremos convertir
        * Declaramos la variable
        * Al asignarle valor, entre parentesis asignamos el tipo
        * al que queremos convertir, seguido de la primera variable*/
        short a2 = (short) a1;
        System.out.println("Int a short = " + a2);

        float a3 = (float) a1;
        System.out.println("Int a float = " + a3);

        //btw hay que tener cuidado al pasar de un tipo de dato grande a uno pequeño
        byte a4 = (byte) a1;
        System.out.println("Int a byte = " + a4);

    }

}
