/**
 * Clase que representa a un cliente del sistema.
 */
public class Cliente{

    private String cedula;
    private String nombre;

    /**
     * Constructor para inicializar los datos del cliente.
     *
     * @param cedula Cédula del cliente.
     * @param nombre Nombre del cliente.
     */

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
   /**
     * Muestra la información del cliente por consola.
     */

    public void mostrarCliente() {
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
    }

}