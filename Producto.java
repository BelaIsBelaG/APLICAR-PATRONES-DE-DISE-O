// Producto.java
/**
 * Clase abstracta que representa un producto que puede formar parte de un pedido.
 */
public abstract class Producto {
    int numero;     // Número identificador del producto
    double precio;  // Precio del producto

    public Producto(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    /**
     * Devuelve el precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método abstracto para mostrar los detalles del producto.
     */
    public abstract void mostrarDetalles();
}