/**
 * Clase que representa una cámara fotográfica como un producto.
 * La clase camara hereda de la clase produto
 */
class Camara extends Producto {
    String marca;   // Marca de la cámara
    String modelo;  // Modelo de la cámara

    /**
     * Constructor de la clase Camara.
     *
     * @param numero Número identificador del producto.
     * @param marca Marca de la cámara.
     * @param modelo Modelo de la cámara.
     * @param precio Precio de la cámara.
     */
    public Camara(int numero, String marca, String modelo, double precio) {
        super(numero, precio);
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Muestra los detalles de la cámara en la consola.
     * Incluye el número, la marca, el modelo y el precio.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Cámara #" + numero + ", Marca: " + marca + ", Modelo: " + modelo + ", Precio: $" + precio);
    }
}