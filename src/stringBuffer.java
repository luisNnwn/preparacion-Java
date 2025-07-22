public class stringBuffer {

    public static void main(String[] args) {

        //siempre se debe declarar así como declaracion de objeto
        StringBuffer sb = new StringBuffer();
        long start = System.currentTimeMillis();

        for (int i=0; i<2000000; i++) {
            sb.append("table");
        }

        long  end = System.currentTimeMillis();
        System.out.println("Tiempo de StringBuffer " + (end-start));

    }
}
