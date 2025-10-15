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
    
    @Override
    public void realizarPago(Cliente cliente, Tarjeta tarjeta) {
        modelo.realizarPago(cliente, tarjeta);
    }

    @Override
    public void buscarClientes(String numero) {
        modelo.buscarClientes(numero);
    }
}
