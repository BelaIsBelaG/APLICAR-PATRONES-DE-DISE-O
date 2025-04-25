/**
 * Clase que representa una foto para impresión.
 */
class Foto {
    String fichero;

    /**
     * Constructor de la foto.
     *
     * @param fichero Nombre del archivo de imagen.
     */
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    /**
     * Imprime la descripción de la foto.
     */
    public void imprimir() {
        System.out.println("Imprimiendo foto: " + fichero);
    }
}
