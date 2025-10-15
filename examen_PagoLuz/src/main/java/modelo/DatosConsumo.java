package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author daniel
 */
public class DatosConsumo {
    
    private int kWh;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private double promedioKWh;
    private int dias;

    public DatosConsumo(int kWh, LocalDateTime fechaInicio, LocalDateTime fechaFin, double promedioKWh, int dias) {
        this.kWh = kWh;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.promedioKWh = promedioKWh;
        this.dias = dias;
    }

    public int getkWh() {
        return kWh;
    }

    public void setkWh(int kWh) {
        this.kWh = kWh;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPromedioKWh() {
        return promedioKWh;
    }

    public void setPromedioKWh(double promedioKWh) {
        this.promedioKWh = promedioKWh;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
}
