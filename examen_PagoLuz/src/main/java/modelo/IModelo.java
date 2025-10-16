package modelo;

/**
 *
 * @author daniel
 */
public interface IModelo {
    
    public void realizarPago(Cliente cliente, Tarjeta tarjeta);
    public void buscarClientes(String numero);
}
