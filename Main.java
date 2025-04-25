import java.util.Date;

/**
 * Clase principal de la aplicacion.
 * Demuestra la creación de un pedido con cámara e impresiones,
 * muestra los detalles del cliente, productos y una factura.
 */
public class Main {

    /**
     * Método principal que ejecuta el flujo del programa.
     */
    public static void main(String[] args) {
        Creamos un cliente
        Cliente cliente = new Cliente("0012345678", "Ana Torres");

        //Creamos y configuramos el gestor de los pedidos
        GestorPedido gestor = new GestorPedido();
        gestor.establecerCliente(cliente);
        gestor.establecerFecha(new Date());
        gestor.establecerTelefono(123456789);

        //Agregamos una camara al pedido
        gestor.agregarCamara(1, "Canon", "EOS 90D", 899.99);
        //Agregamos una impresión con fotos al pedido
        gestor.agregarImpresion(2, "Color", new Foto[]{
            new Foto("foto_playa.jpg"),
            new Foto("foto_montaña.png")
        }, 12.50);

        // Construimos el pedido completo
        Pedido pedido = gestor.construirPedido();
        //Moatramos los detalles del pedido
        pedido.mostrarPedido();
        //Imprimimos la factura
        imprimirFactura(pedido);
    }

    /**
     * Método que imprime una factura detallada del pedido.
     *
     * @param pedido Pedido del cual se generará la factura.
     */
    public static void imprimirFactura(Pedido pedido) {
        System.out.println("\n=======================================");
        System.out.println("                 FACTURA");
        System.out.println("=======================================");
        // Mostrar datos del cliente
        pedido.cliente.mostrarCliente();
        // Mostrar teléfono y fecha del pedido
        System.out.println("Teléfono: " + pedido.telefono);
        System.out.println("Fecha: " + pedido.fecha);
        System.out.println("---------------------------------------");
        System.out.println("Detalle de Productos:");

        // Calcular y mostrar detalles de productos y total
        double total = 0;
        for (Producto p : pedido.productos) {
            p.mostrarDetalles();
            total += p.getPrecio();
        }

        System.out.println("---------------------------------------");
        System.out.printf("TOTAL A PAGAR: $%.2f\n", total);
        System.out.println("=======================================");
        System.out.println("     ¡Gracias por su compra!");
        System.out.println("=======================================");
    }
}




