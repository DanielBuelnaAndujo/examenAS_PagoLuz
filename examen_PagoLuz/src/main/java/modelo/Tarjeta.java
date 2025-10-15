package modelo;

/**
 *
 * @author daniel
 */
public class Tarjeta {
    
    private String numero;
    private int nip;

    public Tarjeta(String numero, int nip) {
        this.numero = numero;
        this.nip = nip;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    
}
