import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("0012345678", "Ana Torres");

        GestorPedido gestor = new GestorPedido();
        gestor.establecerCliente(cliente);
        gestor.establecerFecha(new Date());
        gestor.establecerTelefono(123456789);

        gestor.agregarCamara(1, "Canon", "EOS 90D", 899.99);
        gestor.agregarImpresion(2, "Color", new Foto[]{
            new Foto("foto_playa.jpg"),
            new Foto("foto_montaña.png")
        }, 12.50);

        Pedido pedido = gestor.construirPedido();
        pedido.mostrarPedido();
        imprimirFactura(pedido);
    }

    public static void imprimirFactura(Pedido pedido) {
        System.out.println("\n=======================================");
        System.out.println("                 FACTURA");
        System.out.println("=======================================");
        pedido.cliente.mostrarCliente();
        System.out.println("Teléfono: " + pedido.telefono);
        System.out.println("Fecha: " + pedido.fecha);
        System.out.println("---------------------------------------");
        System.out.println("Detalle de Productos:");

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




