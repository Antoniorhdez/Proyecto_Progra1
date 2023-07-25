package BusinessLogic;

import common.Usuario;

public class Seguridad {

    
    public Usuario[] arreglousuarios = new Usuario[5];

    public void registrodeusuarios() {

        Usuario usuarioadmin = new Usuario();
        usuarioadmin.setVgnombredeusuario("admin");
        usuarioadmin.setVgpassword("123");

        Usuario usuarioclienteOscar = new Usuario("Oscar","123");
        Usuario usuarioclienteHillary = new Usuario("Hillary","123");
        Usuario usuarioclienteMelvin = new Usuario("Melvin","123");
        Usuario usuarioclienteLuis = new Usuario("Luis","123");
       

        arreglousuarios[0] = usuarioadmin;
        arreglousuarios[1] = usuarioclienteOscar;
        arreglousuarios[2] = usuarioclienteHillary;
        arreglousuarios[3] = usuarioclienteMelvin;
        arreglousuarios[4] = usuarioclienteLuis;
        

    }

    public boolean buscarporusuarioclave(String vpusuario, String vpclave) {
        for (int indice = 0; indice <= arreglousuarios.length; indice++) {
            String vlusuarion = arreglousuarios[indice].getVgnombredeusuario();
            String vlclave = arreglousuarios[indice].getVgpassword();
            if (vlclave.equals(vpclave) && vlusuarion.equals(vpusuario))
                return true;
        }
        return false;

    }

}
