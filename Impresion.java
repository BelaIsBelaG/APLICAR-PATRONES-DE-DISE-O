/**
 * Clase que representa una impresión de fotos como un producto.
 * Hereda de la clase Producto.
 */
class Impresion extends Producto {
    String color; //Color de la impresion
    Foto[] fotos; //Arreglo de fotos incluidas en la impresión

    /**
     * Constructor de la clase Impresion.
     *
     * @param numero Número identificador del producto.
     * @param color  Color de la impresión.
     * @param fotos  Arreglo de objetos Foto que contiene los archivos a imprimir.
     * @param precio Precio de la impresión.
     */
    public Impresion(int numero, String color, Foto[] fotos, double precio) {
        super(numero, precio);
        this.color = color;
        this.fotos = fotos;
    }

     /**
     * Muestra los detalles de la impresión en consola.
     * Incluye número, color, lista de nombres de archivo de las fotos y precio.
     */
    @Override
    public void mostrarDetalles() {
        System.out.print("Impresión #" + numero + ", Color: " + color + ", Fotos: ");
        for (Foto foto : fotos) {
            System.out.print(foto.fichero + " ");
        }
        System.out.println(", Precio: $" + precio);
    }
}
