public class operadoresLogicos {

    public static void main(String[] args) {

        /*OPERADORES LÓGICOS*/
        System.out.println("-----OPERADORES LOGICOS-----");
        //Existen dos tipos de operadores lógicos
        // ||(or); &&(and)
        //para esto sirven las tablitas de verdad
        /*
         * AND   V   F    |   OR  V    F
         * V     V   F    |   V   V    V
         * F     F   F    |   F   V    F
         * */
        System.out.println("Existen dos tipos: AND y OR");
        System.out.println("El AND (&&) es verdadero si y solo si las dos condiciones son verdaderas");
        System.out.println("El OR (||) es verdadero con que solo una de las dos condiciones sean verdaderas");
        System.out.println("AND   V   F    |   OR  V    F\n" +
                "           V     V   F    |   V   V    V\n" +
                "           F     F   F    |   F   V    F");
        System.out.println("las tablitas se ven mejor en los comentarios");

        //sin impotar el numero de condiciones a evaluar
        //si una es falsa, todo es falso
        boolean vANDv = true && true;
        boolean vANDf = true && false;
        boolean fANDv = false && true;
        boolean fANDf = false && false;
        System.out.println("AND");
        System.out.println("vANDv = " + vANDv);
        System.out.println("vANDf = " + vANDf);
        System.out.println("fANDv = " + fANDv);
        System.out.println("fANDf = " + fANDf);

        boolean vORv = true || true;
        boolean vORf = true || false;
        boolean fORv = false || true;
        boolean fORf = false || false;

        //sin importar el numero de condiciones a evaluar
        //con solo que una sea verdadero, es verdadero
        System.out.println("OR");
        System.out.println("vORv = " + vORv);
        System.out.println("vORf = " + vORf);
        System.out.println("fORv = " + fORv);
        System.out.println("fORf = " + fORf);

        /*Combinacion de operadores logicos*/
        //para esto hay que considerar que el operador AND
        //siempre va a tener mayor precedencia sobre el operador
        // OR, y se refuerza más la precedencia si hay parentesis
        boolean combinacion = ((true && true)||false) || false;
        System.out.println("combinacion = " + combinacion);


        /*OPERADOR DE NEGACION*/
        System.out.println("-----OPERADOR DE NEGACION-----");
        //esto lo que hace es negar el valor de una condicion
        //se coloca antes de la condicion, y se niega.
        
        //se hace true
        boolean flag = true;
        System.out.println("flag = " + flag);

        //¿cómo se puede usar?

        //como flag es verdadero se imprime
        if (flag) {
            System.out.println("Flag es verdadero: " + flag);
            flag = !flag; //cambiamos el valor de la condicion una vez
            //que ha sido evaluado
        }

        //como ya le cambiamos el valor, ahora entra al otro flag
        //y pos no va a imprimir la linea
        if (flag) {
            System.out.println("Flag no se imprime.");
        }
        

        //OPERADOR TERNARIO
        System.out.println("-----OPERADOR TERNARIO-----");
        //simula en una sola linea un if/else

        boolean verdadero = true;
        boolean falso = false;

        //lectura: si es verdadero, entonces se devuelve verdadero
        //si no, se devuelve falso
        boolean flag2 = verdadero ? verdadero : falso;
        System.out.println("flag2 = " + flag2);
        
        //usando el if else
        if (verdadero) {
            System.out.println("verdadero");
        } else {
            System.out.println("falso");
        }
        
        
        /*OPERADOR instanceOf*/
        System.out.println("-----OPERADOR instanceOf-----");
        //nos ayuda a saber si una instancia es de una clase o no
        
        Integer var1 = 15;
        //esta variable pertenece al tipo de dato entero
        boolean b = var1 instanceof Integer;

        System.out.println("b = " + b);

        String  cadena = ("Hola, voy a probar si esta variable pertenece a la instancia String");
        boolean b1 = cadena instanceof String;
        System.out.println("b1 = " + b1);

        if (b1 == true) {
            cadena.toUpperCase();
            System.out.println(cadena);
        }

        //esto sirve para saber por ejemplo si una clase depende de otra
        //como un examen de adn paterno, este es mijo o no?
        //con el instance of se averigua
        

    }
}
