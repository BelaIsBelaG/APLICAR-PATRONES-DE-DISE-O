import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Clase que representa un pedido realizado por un cliente.
 * Un pedido puede contener múltiples productos.
 */

class Pedido {
    Cliente cliente; // Cliente que realiza el pedido
    Date fecha; //Fecha en la que se realiza el pedido
    int telefono; //Telefono del cliente que realiza el pedido
    List<Producto> productos = new ArrayList<>(); //Lista de productos dentro del pedido

      /**
     * Constructor para inicializar un pedido.
     *
     * @param cliente Cliente que hace el pedido.
     * @param fecha Fecha de realización.
     * @param numeroTarjetaCredito Número de tarjeta asociado.
     */
    public Pedido(Cliente cliente, Date fecha, int telefono) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.telefono = telefono;
    }

     /**
     * Agrega un producto a la lista del pedido.
     * @param p Producto a agregar.
     */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

     /**
     * Muestra todos los detalles del pedido, incluyendo
     * datos del cliente y de los productos.
     */
    public void mostrarPedido() {
        System.out.println("==== RESUMEN DE PEDIDO ====");
        cliente.mostrarCliente();
        System.out.println("Teléfono:" + telefono ); 
        System.out.println("Fecha: " + fecha);
        System.out.println("--- Productos incluidos ---");
        for (Producto p : productos) {
            p.mostrarDetalles();
        }
    }
}
