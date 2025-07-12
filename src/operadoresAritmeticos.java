import java.sql.SQLOutput;

public class operadoresAritmeticos {

    public static void main (String args[]) {

        //Operadores
        //Precedencia de los operadores en Java
        /*- Lo primero que se ejecuta son los parentesis, si
        * hay anidados, se hace de adentro a afuera, si están
        * en el mismo nivel, de izquierda a derecha.
        * - Luego se resuelven las multiplicación, división
        * y residuo, de izquierda a derecha
        * - Luego se resuelven las sumas y restas, se hace de
        * izquierda a derecha */

        System.out.println("-----ORDEN DE PRECEDENCIA-----");
        //el resultado estará mal acá porque se va a resolver
        //primero la division
        int var1 = 3+2+6+7/2;
        System.out.println("var1 = " + var1);

        //por eso hay que agregar parentesis, para que
        //la suma se realice primero
        int var2 = (3+2+6+7)/2;
        System.out.println("var2 = " + var2);
        
        //con los parentesis y multiplicadores 
        int var3 = (4*5) + 3;
        //primero se ejecutan las operaciones de adentro
        System.out.println("var3 = " + var3);

        //int var4 = 2 * 3 % 3 + 2 /2 -1;
        //¿cómo ordenar esto?
        int var4 = ( ( 2 * 3 ) % 3 ) +  2 / 2 - 1;
        System.out.println("var4 = " + var4);

        int var5 = (3 * (3 + 4)) + (2 * (1 + 1));
        /*De acuerdo con las leyes de precedencia
        * de izquierda a derecha y como hay un parentesis
        * interno se va a ejecutar la suma de 3+4, continuando
        * con el otro parentesis interno de 1+1, posteriormente
        * se hará el producto de 3 por el resultado de la suma del
        * parentesis interno anterior, al igual que al otro lado
        * y al final, la suma de ambos lados*/
        System.out.println("var5 = " + var5);


        /*Operadores de igualdad y relacionales*/
        System.out.println("-----OPERADORES DE IGUALDAD Y RELACIONALES-----");

        /*OPERADOR DE IGUALDAD*/
        System.out.println("IGUALDAD ==");
        //NOTA SOBRE ESTO: el signo igual = sirve para asignar valores
        //pero para comparar una igualdad es ==

        int num1 = 4;
        int num2 = 10;
        //aca lo que hicimos fue declarar dos variables, abajo
        //lo que se hace es que el valor de igualdad, será
        //a través de asignacion, si y solo si de acuerdo
        //con el resultado de la comparación
        boolean igualdad = num1 == num2;
        System.out.println("igualdad = " + igualdad);
        
        //también existe el operador distinto !=
        //es lo mismo de arriba, solo que cambia el operador
        boolean distinto = num1 != num2;
        System.out.println("distinto = " + distinto);

        //esto es útil en los condicionales de if
        if (num1 != num2) {
            System.out.println("Resultado de if");
        } else {
            System.out.println("Resultado de else");
        }

        /*OPERADORES RELACIONALES*/
        System.out.println("-----OPERADORES RELACIONALES-----");
        //los operadores relacionales son los de mayor que, menor que
        //menor/mayor igual que y así

        boolean mayor = num1 > num2;
        boolean menos = num1 < num2;
        boolean mayorIgual = num1 >= num2;
        boolean menorIgual = num1 <= num2;

        if (mayor) {
            System.out.println("El numero uno es mayor que dos");
        } else if (menos) {
            System.out.println("Nel, el numero uno es menor");
            //esto es solo para ver como son los condicionales
            //sin embargo, tal como está el código si la condición
            //se cumple acá, a pesar de que alguna de las siguientes
            //condicionales sea cierta, solo se va a mostrar
            //la salida de texto de la primera condidicion que se cumpla
        } else if (mayorIgual) {
            System.out.println("El numero uno es mayor O igual que numero dos");
        } else {
            System.out.println("El numero uno es menor O igual que el numero dos");
        }

        //OPERADOR DE ASIGNACION
        System.out.println("-----OPERADOR DE ASIGNACION-----");

        //a través del = uno puede asignar valores a las variables
        int var6 = 3;
        //y seguidamente uno puede asignar una variable nueva
        //al valor de una variable anterior
        int var7 = var6;
        //pero tambien uno puede hacerle operaciones a la misma variable
        //por ejemplo, sumarle un numero
        var7 = var7 + 1;
        //o también se puede usar los operadores += ó -=
        var7 += 1; //esto es lo mismo de arriba y de abajo

        //Así tenemos también
        //*= multiplica la variable por el valor a continuacion
        //+= suma la variable por el valor a continuacion
        //-= resta la variable por el valor a continuacion
        // /= divide la variable por el valor a continuacion
        // %= saca el modulo de la variable por el valor a continuacion


        //OPERADORES DE INCREMENTO O DECREMENTO
        System.out.println("-----Operador de incremento o decremento-----");
        /*Estos operadores son para ir incrementando en una unidad, o por el contrario
        * decrementando una variable en una undiad
        * Esto se usa a veces en los bucles for*/
        int variable1 = 8 - 1;
        variable1 --; //es lo mismo arriba y abajo, en ambos se resta uno

        int variable2 = 8 + 1;
        variable2 ++; //es lo mismo arriba y abajo, en ambos se suma uno

        //ahora bien, existe el preincremento y el postincremento
        // la unica diferencia es que se hace así: ++variable2 --> preincremento
        // variable2++ --> postincremento
        //¿para que se usa cada uno? No se sabe, bueno, si se ha de saber, pero yo en este momento no lo sé

        int b;
        b = 6;

        System.out.println("INCREMENTO");
        //aca el valor es seis
        System.out.println("b: " + b);
        //en el postincremento, lo que se hace es aumentar el valor despues
        //y por eso imprime seis
        System.out.println("b++ (postincremento): " + b++);
        //acá, lo que hace es que el valor anterior era 7, entonces lo incrementa
        //de una vez, y por eso es ocho
        System.out.println("++b (preincremento): " + ++b);

        System.out.println("DECREMENTO");
        //acá el valor es ocho, o sea, la variable de ultimo quedo en ocho
        System.out.println("b: " + b);
        //en el post decremento, aun es 8 porque se va a decrementar
        //hasta el final, o sea queda en siete
        System.out.println("b-- (postdecremento): " + b--);
        //aca ya estaba en siete, pero como se decrementa antes
        //se decrementa a seis
        System.out.println("--b (predecremento): " + --b);
    }
}
