package Common;

public class Mesa {
    

    /** definimos los atributos que salen para representarlos con variables */
    public int vgNumeroDeMesa;
    public int vgCantidadDeSillas;

    /* Constrcutor */
    public Mesa(){
        vgNumeroDeMesa = 0;
        vgCantidadDeSillas = 0;
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

    
}
    
