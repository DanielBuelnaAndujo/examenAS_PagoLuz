package vista;

import controlador.IControlador;
import java.util.List;
import modelo.Cliente;
import modelo.ISuscriptor;
import modelo.Recibo;
import modelo.Tarjeta;

/**
 *
 * @author daniel
 */
public class ControlVista implements ISuscriptor {
    
    private static ControlVista controlVista;
    private IControlador control;
    private List<Cliente> clientes;
    private Cliente cliente;
    private Recibo recibo;

    private ControlVista() {
    }

    // ControlVista es un Singleton para forzar a que solo haya 1 intancia
    // y que no haya problemas por los atributos importantes que contiene.
    public static ControlVista getInstancia() {
        if (controlVista == null) {
            controlVista = new ControlVista();
        }
        return controlVista;
    }

    // Getters y Setters
    public void setControl(IControlador control) {
        this.control = control;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Recibo getRecibo() {
        return recibo;
    }
    
    // Metodos Principales
    public void realizarPago(Tarjeta tarjeta) {
        control.realizarPago(cliente, tarjeta);
    }
    
    public void buscarClientes(String numero) {
        control.buscarClientes(numero);
    }
    
    // Metodos para abrir Frames
    public void mostrarFrmClientes() {
        new FrmClientes().setVisible(true);
    }
    
    public void mostrarFrmTarjeta() {
        new FrmPago().setVisible(true);
    }
    
    public void mostrarFrmRecibo() {
        if (recibo == null) {
            return;
        }
        
        new FrmRecibo().setVisible(true);
    }

    // Metodos de la interfaz ISuscriptor
    // Observer debe tener minimo 1 método en su interfaz suscriptora,
    // asi que agregue 2 según el cambio que debe hacer la vista.
    
    // Método para mostrar el Recibo de Pago en el FrmRecibo.
    @Override
    public void actualizarRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    // Método para mostrar los Clientes en el Panel contenedor de FrmClientes.
    @Override
    public void actualizarClientes(List<Cliente> clientes) {
        clientes.forEach(c -> System.out.println(c.getNumeroServicio()));
        this.clientes = clientes;
    }
}
