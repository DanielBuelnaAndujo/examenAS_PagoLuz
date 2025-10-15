package modelo;

/**
 *
 * @author daniel
 */
public class Cliente {
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numeroServicio;
    private DatosConsumo datosConsumo;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroServicio, DatosConsumo datosConsumo) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numeroServicio = numeroServicio;
        this.datosConsumo = datosConsumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNumeroServicio() {
        return numeroServicio;
    }

    public void setNumeroServicio(String numeroServicio) {
        this.numeroServicio = numeroServicio;
    }

    public DatosConsumo getDatosConsumo() {
        return datosConsumo;
    }

    public void setDatosConsumo(DatosConsumo datosConsumo) {
        this.datosConsumo = datosConsumo;
    }
    
}
