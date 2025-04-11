/**
 * Clase concreta que representa un producto del tipo "Impresión".
 * Aplica el principio de composición al incluir un objeto de tipo Foto.
 */
class Impresion extends Producto {
    String color;
    Foto foto;

    /**
     * Constructor para crear una nueva impresión.
     *
     * @param numero Número del producto en el pedido.
     * @param color  Tipo de color de la impresión.
     * @param foto   Objeto Foto que contiene el archivo a imprimir.
     */
    public Impresion(int numero, String color, Foto foto) {
        this.numero = numero;
        this.color = color;
        this.foto = foto;
    }

     /**
     * Muestra los detalles específicos de una impresión.
     * Implementación concreta del método abstracto.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Impresión #" + numero + ", Color: " + color + ", Foto: " + foto.fichero);
    }
}