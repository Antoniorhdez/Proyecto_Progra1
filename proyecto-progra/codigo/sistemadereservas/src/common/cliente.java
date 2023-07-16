package common;

import java.lang.reflect.Constructor;


public class cliente {

    
    private String vgNombre;
    private String vgApellido;
    private String vgIdentificacion;
    private String vgTelefono; 
    public cliente(String vpNombre, String vpApellido, String vpIdentificacion, String vpTelefono) {
       
        vgNombre = vpNombre;
        vgApellido = vpApellido;
        vgIdentificacion = vpIdentificacion;
        vgTelefono = vpTelefono;
    }

    public cliente(){
        vgNombre = "";
        vgApellido = "";
        vgIdentificacion = "";
        vgTelefono = "";
    }

    public cliente(String vpIdentificacion){
        vgNombre = "";
        vgApellido = "";
        vgIdentificacion = vpIdentificacion;
        vgTelefono = "";
    }

   
    public String getNombre() {
        return vgNombre;
    }

    public void setNombre(String nombre) {
        vgNombre = nombre;
    }

    public String getApellido() {
        return vgApellido;
    }

    public void setApellido(String apellido) {
        vgApellido = apellido;
    }

    public String getIdentificacion() {
        return vgIdentificacion;
    }

    public void setIdentificacion(String identificacion) {
        vgIdentificacion = identificacion;
    }

    public String getTelefono() {
        return vgTelefono;
    }

    public void setTelefono(String telefono) {
        vgTelefono = telefono;
    }

    public String getInformacion() {
        return "Nombre: " + getNombre() + " Apellido: " + getApellido() + " Identificacion: " + getIdentificacion();
    }

}
