package modelo;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author daniel
 */
public class BaseDatos {
    
    private List<Cliente> clientes;

    public BaseDatos(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public List<Cliente> obtenerClientesPorNumero(String numero) {
        List<Cliente> resultado = clientes.stream().filter(c -> c.getNumeroServicio() == numero)
                .collect(Collectors.toList());
        
        return resultado;
    }
}
