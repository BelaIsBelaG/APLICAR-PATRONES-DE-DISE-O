class Impresion extends Producto {
    String color;
    Foto[] fotos;

    public Impresion(int numero, String color, Foto[] fotos, double precio) {
        super(numero, precio);
        this.color = color;
        this.fotos = fotos;
    }

    @Override
    public void mostrarDetalles() {
        System.out.print("Impresión #" + numero + ", Color: " + color + ", Fotos: ");
        for (Foto foto : fotos) {
            System.out.print(foto.fichero + " ");
        }
        System.out.println(", Precio: $" + precio);
    }
}
