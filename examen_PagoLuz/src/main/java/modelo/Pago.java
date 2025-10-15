package modelo;

import java.util.List;

/**
 *
 * @author daniel
 */
public class Pago implements IModelo {
    
    private BaseDatos baseDatos;
    private List<ISuscriptor> suscriptores;

    public Pago(BaseDatos baseDatos, List<ISuscriptor> suscriptores) {
        this.baseDatos = baseDatos;
        this.suscriptores = suscriptores;
    }
    
    @Override
    public Recibo realizarPago(Cliente cliente, Tarjeta tarjeta) {
        
        
        return null;
    }

    @Override
    public void buscarClientes(String numero) {
        List<Cliente> clientes = baseDatos.obtenerClientesPorNumero(numero);
        suscriptores.forEach(s -> s.actualizarClientes(clientes));
    }
}
