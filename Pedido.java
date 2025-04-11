import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Pedido {
    Cliente cliente; // Agregación
    Date fecha;
    int telefono;
    List<Producto> productos = new ArrayList<>();

    public Pedido(Cliente cliente, Date fecha, int telefono) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.telefono = telefono;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

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
