package edut4;
import static edut4.Factura.*;
import static edut4.Proveedor.*;

public class EDUT4 {

public static void main(String[] args) { 

    Cliente cliente = new Cliente ("Jose");
    imprimeFactura(cliente, 15.0, 12); 
    pedirDatos();
} 
    
}