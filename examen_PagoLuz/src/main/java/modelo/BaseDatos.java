package modelo;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author daniel
 */
public class BaseDatos {
    
    private List<Cliente> clientes = Arrays.asList(
            new Cliente("Daniel", "Buelna", "Andujo", "002",
                    new DatosConsumo(5, LocalDate.of(2025, Month.SEPTEMBER, 8), LocalDate.of(2025, Month.OCTOBER, 8), 1, 30)
            ),
            new Cliente("Luis Eduardo", "Uribe", "Vega", "0023",
                    new DatosConsumo(10, LocalDate.of(2025, Month.SEPTEMBER, 14), LocalDate.of(2025, Month.OCTOBER, 14), 1, 30)
            ),
            new Cliente("Christopher", "Alvarez", "Centeno", "00234",
                    new DatosConsumo(15, LocalDate.of(2025, Month.SEPTEMBER, 23), LocalDate.of(2025, Month.OCTOBER, 23), 1, 30)
            ),
            new Cliente("Katia Ximena", "Navarez", "Espinoza", "002345",
                    new DatosConsumo(15, LocalDate.of(2025, Month.SEPTEMBER, 15), LocalDate.of(2025, Month.OCTOBER, 15), 1, 30)
    ));
    
    public BaseDatos() {
    }
    
    public List<Cliente> obtenerClientesPorNumero(String numero) {
        List<Cliente> resultado = clientes.stream().filter(c -> c.getNumeroServicio() == numero)
                .collect(Collectors.toList());
        
        return resultado;
    }
}
