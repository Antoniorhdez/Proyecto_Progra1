package buisnesLogic;

import Common.usuario;

public class seguridad {

    
    public usuario[] arreglousuarios = new usuario[5];

    public void registrodeusuarios() {

        usuario usuarioadmin = new usuario();
        usuarioadmin.setVgnombredeusuario("admin");
        usuarioadmin.setVgpassword("123");

        usuario usuarioclientejhon = new usuario("jhon","123");
        usuario usuarioclienteoscar = new usuario("oscar","123");
        usuario usuarioclientepablo = new usuario("pablo","123");
        usuario usuarioclientekathy = new usuario("kathy","123");
        usuario usuarioclientearmando = new usuario("armando","123");

        arreglousuarios[0] = usuarioadmin;
        arreglousuarios[1] = usuarioclientejhon;
        arreglousuarios[2] = usuarioclienteoscar;
        arreglousuarios[3] = usuarioclientepablo;
        arreglousuarios[4] = usuarioclientekathy;
        arreglousuarios[5] = usuarioclientearmando;

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
