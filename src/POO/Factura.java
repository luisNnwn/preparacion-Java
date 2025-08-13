package POO;

public class Factura {

    private double montoTotal;
    //uso de final para crear constantes
    final double IMPUESTO = 0.19;

    //constructor         parametro de constructor
    public Factura(double montoTotal) {
        //  variable de clase
        this.montoTotal = montoTotal;
    }

    //metodo publico que llama a un metodo privado, no importa
    //como se hace el proceso de implementacion, solo obtener el monto mas impuesto
    public double calcularTotalConImpuesto(){
        double impuesto = calcularImpuestoInterno();
        return montoTotal + impuesto;
    }

    //metodo privado
    private double calcularImpuestoInterno (){
        return IMPUESTO * montoTotal;
    }

    //main solo para ejecutar el programa
    public static void main(String[] args) {
        Factura factura = new Factura(5000);
        System.out.println("Monto total con impuesto: " + factura.calcularTotalConImpuesto());
    }
}


