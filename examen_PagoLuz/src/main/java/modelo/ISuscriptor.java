package modelo;

import java.util.List;

/**
 *
 * @author daniel
 */
public interface ISuscriptor {
    
    public void actualizarRecibo(Recibo recibo);
    public void actualizarClientes(List<Cliente> clientes);
}
