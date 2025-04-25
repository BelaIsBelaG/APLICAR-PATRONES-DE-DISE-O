import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase que gestiona la construcción de un pedido antes de crearlo formalmente.
 */
class GestorPedido {
    private Cliente cliente;
    private Date fecha;
    private int telefono;
    private List<Producto> productos = new ArrayList<>();

    /**
     * Establece el cliente para el pedido.
     * @param cliente Cliente que realiza el pedido.
     */
    public void establecerCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Establece la fecha del pedido.
     * @param fecha Fecha en la que se realiza el pedido.
     */
    public void establecerFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Establece el teléfono del cliente.
     * @param telefono Número telefónico.
     */
    public void establecerTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Agrega una cámara al pedido.
     */
    public void agregarCamara(int numero, String marca, String modelo, double precio) {
        productos.add(new Camara(numero, marca, modelo, precio));
    }

    /**
     * Agrega una impresión al pedido.
     */
    public void agregarImpresion(int numero, String color, Foto[] fotos, double precio) {
        productos.add(new Impresion(numero, color, fotos, precio));
    }

    /**
     * Construye un objeto Pedido con los datos establecidos.
     */
    public Pedido construirPedido() {
        Pedido pedido = new Pedido(cliente, fecha, telefono);
        for (Producto p : productos) {
            pedido.agregarProducto(p);
        }
        return pedido;
    }
}

