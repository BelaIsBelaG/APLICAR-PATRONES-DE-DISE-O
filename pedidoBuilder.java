import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Clase constructora (Builder) que permite construir objetos Pedido
 * de forma flexible y modular. Implementa el patrón de diseño Builder.
 */
class PedidoBuilder {
    private Cliente cliente; //Cliente que realiza el pedido
    private Date fecha; //Fecha del pedido
    private int telefono; //Numero del telefono del cliente que realiza el pedido
    private List<Producto> productos = new ArrayList<>(); //Lista de los productos incluidos

    /**
     * Establece el cliente asociado al pedido.
     * @param cliente Objeto Cliente.
     * @return El mismo builder para encadenamiento.
     */
    public PedidoBuilder setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    /**
     * Establece la fecha del pedido.
     * @param fecha Fecha en formato Date.
     * @return El mismo builder para encadenamiento.
     */
    public PedidoBuilder setTelefono(int telefono) {
        this.telefono = telefono;
        return this;
    }

    /**
     * Establece el número de telefono del cliente.
     * @param numero Número de la tarjeta.
     * @return El mismo builder para encadenamiento.
     */
    public PedidoBuilder setFecha(Date fecha) {
        this.fecha = fecha;
        return this;
    }

    /**
     * Agrega un producto del tipo Impresión al pedido.
     * @param numero Número del producto.
     * @param color Tipo de impresión (Color o B/N).
     * @param foto Foto a imprimir.
     * @return El mismo builder para encadenamiento.
     */
    public PedidoBuilder agregarImpresion(int numero, String color, Foto foto) {
        productos.add(new Impresion(numero, color, foto));
        return this;
    }

    /**
     * Agrega un producto del tipo Cámara al pedido.
     * @param numero Número del producto.
     * @param marca Marca de la cámara.
     * @param modelo Modelo de la cámara.
     * @return El mismo builder para encadenamiento.
     */
    public PedidoBuilder agregarCamara(int numero, String marca, String modelo) {
        productos.add(new Camara(numero, marca, modelo));
        return this;
    }

     /**
     * Construye el objeto Pedido final a partir de los atributos configurados.
     * @return Objeto Pedido completamente inicializado.
     */
    public Pedido build() {
        Pedido pedido = new Pedido(cliente, fecha, telefono);
        for (Producto p : productos) {
            pedido.agregarProducto(p);
        }
        return pedido;
    }
}