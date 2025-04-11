/**
 * Clase simple que representa una foto digital.
 */

class Foto {
    String fichero; //Nombre del archivo que representa la imagen
    /**
     * Constructor que recibe el nombre del fichero de imagen.
     *
     * @param fichero Nombre del archivo de foto.
     */
    public Foto(String fichero) {
        this.fichero = fichero;
    }
    
    /**
     * Simula la impresión de la foto por consola.
     */

    public void imprimir() {
        System.out.println("Imprimiendo foto: " + fichero);
    }
}
