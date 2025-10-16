package modelo;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Pago implements IModelo {
    
    private BaseDatos baseDatos;
    private Banco banco;
    private List<ISuscriptor> suscriptores;

    public Pago(BaseDatos baseDatos, Banco banco, List<ISuscriptor> suscriptores) {
        this.baseDatos = baseDatos;
        this.banco = banco;
        this.suscriptores = suscriptores;
    }
    
    public void addSuscriptor(ISuscriptor suscriptor){
        suscriptores.add(suscriptor);
    }
    
    @Override
    public void realizarPago(Cliente cliente, Tarjeta tarjeta) {
        boolean resultado = banco.pagar(tarjeta);
        
        if (resultado) {
            suscriptores.forEach(s -> s.actualizarRecibo(new Recibo(
                    LocalDateTime.now(), 
                    cliente.getDatosConsumo().getMonto(), 
                    cliente)));
        } else {
            suscriptores.forEach(s -> s.actualizarRecibo(null));
        }
    }

    @Override
    public void buscarClientes(String numero) {
        List<Cliente> clientes = baseDatos.obtenerClientesPorNumero(numero);
        suscriptores.forEach(s -> s.actualizarClientes(clientes));
    }
}
