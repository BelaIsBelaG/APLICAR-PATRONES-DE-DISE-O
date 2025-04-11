/**
 * Clase abstracta base que define el contrato para todos los productos que pueden
 * ser incluidos en un pedido. Esta clase utiliza polimorfismo mediante el método
 * abstracto mostrarDetalles().
 */
public abstract class Producto{
    int numero; // Número identificador del producto dentro del pedido

    /**
     * Método abstracto que debe ser implementado por todas las subclases
     * para mostrar los detalles específicos del producto.
     */
public abstract void mostrarDetalles();
}