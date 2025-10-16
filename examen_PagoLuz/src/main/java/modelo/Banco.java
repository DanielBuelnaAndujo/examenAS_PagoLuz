package modelo;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Banco {
    
    private List<Tarjeta> tarjetas = Arrays.asList(
            new Tarjeta("1234", 123)
    );
    
    public boolean pagar(Tarjeta tarjeta) {
        Tarjeta resultado = tarjetas.stream().filter(t -> t.getNumero().equals(tarjeta.getNumero()) &&
                        t.getNip() == tarjeta.getNip())
                        .findFirst()
                        .orElse(null);
        if (resultado == null) {
            return false;
        } else {
            return true;
        }
    }
}
