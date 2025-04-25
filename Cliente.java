/**
 * Clase que representa a un cliente.
 */
public class Cliente {
    private String cedula;
    private String nombre;

    /**
     * Constructor del cliente.
     *
     * @param cedula Número de identificación del cliente.
     * @param nombre Nombre del cliente.
     */
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    /**
     * Muestra los datos del cliente.
     */
    public void mostrarCliente() {
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
    }
}
