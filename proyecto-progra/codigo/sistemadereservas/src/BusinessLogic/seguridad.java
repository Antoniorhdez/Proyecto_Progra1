package BusinessLogic;

import common.Usuario;

public class seguridad {

    
    public Usuario[] arreglousuarios = new Usuario[5];

    public void registrodeusuarios() {

        Usuario usuarioadmin = new Usuario();
        usuarioadmin.setVgnombredeusuario("admin");
        usuarioadmin.setVgpassword("123");

        Usuario usuarioclienteoscar = new Usuario("Oscar","123");
        Usuario usuarioclientehillary = new Usuario("Hillary","123");
        Usuario usuarioclientemelvin = new Usuario("Melvin","123");
        Usuario usuarioclienteluis = new Usuario("Luis","123");
       

        arreglousuarios[0] = usuarioadmin;
        arreglousuarios[1] = usuarioclienteoscar;
        arreglousuarios[2] = usuarioclientehillary;
        arreglousuarios[3] = usuarioclientemelvin;
        arreglousuarios[4] = usuarioclienteluis;
        

    }

    public boolean buscarporusuarioclave(String vpusuario, String vpclave) {
        for (int indice = 0; indice < arreglousuarios.length; indice++) {
            String vlusuarion = arreglousuarios[indice].getVgnombredeusuario();
            String vlclave = arreglousuarios[indice].getVgpassword();
            if (vlclave.equals(vpclave) && vlusuarion.equals(vpusuario))
                return true;
        }
        return false;

    }

}
