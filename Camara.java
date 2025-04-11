// Producto tipo Camara
class Camara extends Producto {
    String marca;
    String modelo;

    public Camara(int numero, String marca, String modelo) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cámara #" + numero + ", Marca: " + marca + ", Modelo: " + modelo);
    }
}