package edut4;
public class Compra {
    public double calculaTotal(double precioUnidad, int cantidad) {
        double subtotal = calculaSubtotal(precioUnidad, cantidad);
        return subtotal - calculaDescuento(subtotal);
    }
    private double calculaSubtotal(double precioUnidad, int cantidad) {
        return precioUnidad * cantidad;
    }
    private double calculaDescuento(double subtotal) {
        if (subtotal > 200) {
            return subtotal * 0.15;
        }
        return 0;
    }
}