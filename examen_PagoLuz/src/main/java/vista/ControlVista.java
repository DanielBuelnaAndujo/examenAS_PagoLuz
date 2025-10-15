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
        new FrmRecibo().setVisible(true);
    }

    // Metodos de la interfaz ISuscriptor
    @Override
    public void actualizarRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    @Override
    public void actualizarClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
