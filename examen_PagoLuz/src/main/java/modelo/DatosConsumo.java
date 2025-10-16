package modelo;

import java.time.LocalDate;

/**
 *
 * @author daniel
 */
public class DatosConsumo {
    
    private int kWh;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double promedioKWh;
    private int dias;

    public DatosConsumo(int kWh, LocalDate fechaInicio, LocalDate fechaFin, double promedioKWh, int dias) {
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
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
