package controlador;

import modelo.Cliente;
import modelo.IModelo;
import modelo.Tarjeta;

/**
 *
 * @author daniel
 */
public class Controlador implements IControlador {
    
    private IModelo modelo;

    public Controlador(IModelo modelo) {
        this.modelo = modelo;
    }
    
    // A falta de DTOs (no necesarias por el momento), los métodos de Controlador
    // solo sirven como un intermediario entre Vista y Modelo. Es por esto que
    // pasa los datos directamente o solo los que necesita.
    @Override
    public void realizarPago(Cliente cliente, Tarjeta tarjeta) {
        modelo.realizarPago(cliente, tarjeta);
    }

    @Override
    public void buscarClientes(String numero) {
        modelo.buscarClientes(numero);
    }
}
