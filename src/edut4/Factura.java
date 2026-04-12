package edut4;
public class Factura {

// Aqui empiezo a realizar la refactorización

String palabra = "monitor";

public static double calculaSubtotal(double precioUnidad, int cantidad){
    return precioUnidad * cantidad;
}

public static double calculaDescuento(double subtotal, int cantidad){
    if(cantidad > 10 ){
        return subtotal * 0.1;
    }
    return 0;
}

/**
 * 
 * Calcula el precio que vale el total de unidades que se compra aplicando el descuento
 * 
 * @param precioUnidad precio del producto
 * @param cantidad unidades de producto que se venden 
 * @return precio final de las unidades vendidas
 */
public static double calculaTotal(double precioUnidad, int cantidad){
    double subtotal = calculaSubtotal(precioUnidad, cantidad);
    double descuento = calculaDescuento(subtotal, cantidad);
    return subtotal-descuento;
}


public static double calculaTotal2(double precioUnidad, int cantidad){
    double subtotal = calculaSubtotal(precioUnidad, cantidad);
    double descuento = calculaDescuento(subtotal, cantidad);
    return subtotal-descuento;
}

public static void imprimeFactura(Cliente cliente, double precioUnidad, int cantidad){
    double subtotal = calculaSubtotal(precioUnidad, cantidad);
    double descuento = calculaDescuento(subtotal, cantidad);
    double total = calculaTotal(precioUnidad, cantidad);

    System.out.println("Cliente: "+cliente.getNombre()); 
    System.out.println("Cantidad: "+cantidad); 
    System.out.println("Precio unidad: "+precioUnidad);
    System.out.println("Subtotal "+subtotal);
    System.out.println("Descuento "+descuento);
    System.out.println("Total a pagar: " + total); 
}

}