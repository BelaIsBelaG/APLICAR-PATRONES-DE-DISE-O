// Camara.java
/**
 * Clase que representa una cámara fotográfica como un producto.
 */
class Camara extends Producto {
    String marca;   // Marca de la cámara
    String modelo;  // Modelo de la cámara

    //Método constructor de la clase
    public Camara(int numero, String marca, String modelo, double precio) {
        super(numero, precio);
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Muestra los detalles de la cámara.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Cámara #" + numero + ", Marca: " + marca + ", Modelo: " + modelo + ", Precio: $" + precio);
    }
}