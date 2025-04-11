// Producto tipo Impresion (usa composición con Foto)
class Impresion extends Producto {
    String color;
    Foto foto;

    public Impresion(int numero, String color, Foto foto) {
        this.numero = numero;
        this.color = color;
        this.foto = foto;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Impresión #" + numero + ", Color: " + color + ", Foto: " + foto.fichero);
    }
}