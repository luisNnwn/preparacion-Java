public class stringBuilder {

    public static void main(String[] args) {

        //siempre se debe declarar así como declaracion de objeto
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<2000000; i++) {
            sb.append("table");
        }

        long  end = System.currentTimeMillis();
        System.out.println("Tiempo de StringBuilder " + (end-start));

        int arreglo [] = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(arreglo.length);




    }

}
