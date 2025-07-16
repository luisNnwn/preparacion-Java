public class cicloForEach {

    public static void main(String[] args) {

        /*El foreach es un for abreviado
        *
        *La forma es así:
        *
        * String [] arreglo = {"Hola", "l", "mondongo"}
        *
        * - Son dos argumentos:
        * *El primero es la variable que vamos a recibir, esta
        * variable se crea, es como el i o el j
        * *Luego asignamos esa variable con : al arreglo que creamos
        *
        *for (String variable: arreglo) {
        *       el codigo del ciclo
        * }
        *
        * o sea vamos a iterar un arreglo, aunque con el otro for tambien
        * se puede, pero este supuestamente es mejor
        *
        * */

        System.out.println("-----UN HAIKU ITERADO-----");
        //declaro el arreglo que se va a iterar
        String [] haiku = {"Del mismo tipo", "surgiendo desde cero", "sin un indice"};

        //a la variable frase se le asigna el arreglo
        //y cada que se recorra el arreglo, se le asigna cada uno
        //de los elementos del arreglo, hasta llegar al límite de iteracion
        //el cual es el nombre
        for (String frase : haiku){
            System.out.println(frase);
        }

    }

}
