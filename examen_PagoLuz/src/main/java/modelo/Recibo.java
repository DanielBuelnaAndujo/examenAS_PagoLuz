package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author daniel
 */
public class Recibo {
    
    private LocalDateTime fecha;
    private double monto;
    private Cliente cliente;

    public Recibo(LocalDateTime fecha, double monto, Cliente cliente) {
        this.fecha = fecha;
        this.monto = monto;
        this.cliente = cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
