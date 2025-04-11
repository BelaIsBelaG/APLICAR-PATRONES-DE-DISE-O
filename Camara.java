/**
 * Clase concreta que representa un producto del tipo "Cámara".
 */
class Camara extends Producto {
    String marca;
    String modelo;

    /**
     * Constructor para crear una nueva cámara.
     *
     * @param numero Número del producto en el pedido.
     * @param marca  Marca de la cámara.
     * @param modelo Modelo de la cámara.
     */
    public Camara(int numero, String marca, String modelo) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Muestra los detalles específicos de una cámara.
     * Implementación concreta del método abstracto.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Cámara #" + numero + ", Marca: " + marca + ", Modelo: " + modelo);
    }
}