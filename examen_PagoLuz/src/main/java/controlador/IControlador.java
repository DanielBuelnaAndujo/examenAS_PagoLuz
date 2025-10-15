package controlador;

import modelo.Cliente;
import modelo.Tarjeta;

/**
 *
 * @author daniel
 */
public interface IControlador {
    
    public void realizarPago(Cliente cliente, Tarjeta tarjeta);
    public void buscarClientes(String numero);
}
