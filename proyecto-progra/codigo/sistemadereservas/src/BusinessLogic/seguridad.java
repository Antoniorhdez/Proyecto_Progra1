package buisnesLogic;

import Common.usuario;

public class seguridad {

    
    public usuario[] arreglousuarios = new usuario[5];

    public void registrodeusuarios() {

        usuario usuarioadmin = new usuario();
        usuarioadmin.setVgnombredeusuario("admin");
        usuarioadmin.setVgpassword("123");

        usuario usuarioclienteoscar = new usuario("oscar","123");
        usuario usuarioclientehillary = new usuario("hillary","123");
        usuario usuarioclientemelvin = new usuario("melvin","123");
        usuario usuarioclienteluis = new usuario("luis","123");
       

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
