package modelo;

/**
 *
 * @author daniel
 */
public interface IModelo {
    
    public Recibo realizarPago(Cliente cliente, Tarjeta tarjeta);
    public void buscarClientes(String numero);
}
