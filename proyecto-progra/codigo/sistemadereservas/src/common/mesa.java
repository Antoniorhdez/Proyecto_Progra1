package common;

public class Mesa {

    
    private int vgNumeroDeMesa;
    private int vgCantidadDeSillas;
    
    private String vgEstado;
    private Cliente vgCliente;
    private String fecha; 
    private String hora; 
   

    public Mesa() {
        vgNumeroDeMesa = 0;
        vgCantidadDeSillas = 0;
    }

    public Mesa(int vpNumeroMesa, int vpCantidadSillas) {
        vgNumeroDeMesa = vpNumeroMesa;
        vgCantidadDeSillas = vpCantidadSillas;
        vgEstado = "Disponible";
    }

    public int getVgNumeroDeMesa() {
        return vgNumeroDeMesa;
    }

    public void setVgNumeroDeMesa(int vgNumeroDeMesa) {
        this.vgNumeroDeMesa = vgNumeroDeMesa;
    }

    public int getVgCantidadDeSillas() {
        return vgCantidadDeSillas;
    }

    public void setVgCantidadDeSillas(int vgCantidadDeSillas) {
        this.vgCantidadDeSillas = vgCantidadDeSillas;
    }

    public String getVgEstado() {
        return vgEstado;
    }

    public void setVgEstado(String vgEstado) {
        this.vgEstado = vgEstado;
    }

    public Cliente getVgCliente() {
        return vgCliente;
    }

    public void setVgCliente(Cliente vgCliente) {
        this.vgCliente = vgCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
