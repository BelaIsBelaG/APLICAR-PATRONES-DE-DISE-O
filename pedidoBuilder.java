import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// Builder para crear objetos Pedido de forma modular
class PedidoBuilder {
    private Cliente cliente;
    private Date fecha;
    private int telefono;
    private List<Producto> productos = new ArrayList<>();

    public PedidoBuilder setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }
    public PedidoBuilder setTelefono(int telefono) {
        this.telefono = telefono;
        return this;
    }
    public PedidoBuilder setFecha(Date fecha) {
        this.fecha = fecha;
        return this;
    }


    public PedidoBuilder agregarImpresion(int numero, String color, Foto foto) {
        productos.add(new Impresion(numero, color, foto));
        return this;
    }

    public PedidoBuilder agregarCamara(int numero, String marca, String modelo) {
        productos.add(new Camara(numero, marca, modelo));
        return this;
    }

    public Pedido build() {
        Pedido pedido = new Pedido(cliente, fecha, telefono);
        for (Producto p : productos) {
            pedido.agregarProducto(p);
        }
        return pedido;
    }
}