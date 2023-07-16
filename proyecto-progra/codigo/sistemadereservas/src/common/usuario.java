package common;

public class Usuario {
    private String vgnombredeusuario;
    private String vgpassword;

    public Usuario (){
        vgnombredeusuario = "";
        vgpassword = "";
        
    }
    public Usuario(String vpnombredeusuario,String vpasword) {
        vgnombredeusuario = vpnombredeusuario;
        vgpassword = vpasword;
    }

    public String getVgnombredeusuario() {
        return vgnombredeusuario;
    }

    public void setVgnombredeusuario(String vgnombredeusuario) {
        this.vgnombredeusuario = vgnombredeusuario;
    }

    public String getVgpassword() {
        return vgpassword;
    }

    public void setVgpassword(String vgpassword) {
        this.vgpassword = vgpassword;
    }
}
