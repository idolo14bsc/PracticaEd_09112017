package ec.edu.ister.modelo;

/**
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Enamorada {

    private String nombre;
    private String apellido;
    private String cedula;

    public Enamorada() {
    }

    public Enamorada(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\nApellido:" + apellido + ""
                + "\nCi:" + getCedula();
    }
    
    public static void banar(){
        System.out.println("se esta bañando");
    }

}
