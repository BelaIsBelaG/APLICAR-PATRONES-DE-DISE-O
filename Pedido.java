import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase que representa un pedido hecho por un cliente.
 */
class Pedido {
    Cliente cliente;
    Date fecha;
    int telefono;
    List<Producto> productos = new ArrayList<>();

    /**
     * Constructor del pedido.
     *
     * @param cliente Cliente que realiza el pedido.
     * @param fecha Fecha del pedido.
     * @param telefono Teléfono del cliente.
     */
    public Pedido(Cliente cliente, Date fecha, int telefono) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.telefono = telefono;

    }
public void agregarProducto(Producto p) {
    productos.add(p);
}
    
        /**
        * Muestra los detalles del pedido.
        */
        public void mostrarPedido() {
            System.out.println("Detalles del Pedido:");
            cliente.mostrarCliente();
            System.out.println("Teléfono: " + telefono);
            System.out.println("Fecha: " + fecha);
            System.out.println("Productos en el pedido:");
            for (Producto p : productos) {
                p.mostrarDetalles();
            }
        }
}
