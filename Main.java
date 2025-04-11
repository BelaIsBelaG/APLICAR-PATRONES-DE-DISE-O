/**
 * Clase principal que simula la ejecución del sistema de pedidos.
 */
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("0012345678", "Ana Torres");

        // Crear pedido con productos usando el Builder
        Pedido pedido = new PedidoBuilder()
                .setCliente(cliente)
                .setFecha(new Date())
                .setTelefono(123456789)
                .agregarCamara(1, "Canon", "EOS 90D")
                .agregarImpresion(2, "Color", new Foto("foto_playa.jpg"))
                .agregarImpresion(3, "Blanco y Negro", new Foto("foto_montaña.png"))
                .build();

        // Mostrar los detalles del pedidogenerado
        pedido.mostrarPedido();
    }
}
