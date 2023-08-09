 package BusinessLogic; p

import java.util.Scanner;
import common.Cliente;
import common.Mesa;

public class Menu {
 
    private Mesa[] vgArregloDeMesas = new Mesa[10];
    final String vgEstadoDisponible = "Disponible";
    final String vgEstadoReservada = "Reservada";

    
    public Menu() { 

        inicializarMesas();

        login();
    } 
    
    public void MostrarOpciones() {

        
        
        Scanner entrada = new Scanner(System.in);

       
        int opcion = 0;

        
        do { 

            
            System.out.println("=== Menú ===");
            System.out.println("1. Consulta de mesas disponibles");
            System.out.println("2. Reservar mesa");
            System.out.println("3. Consulta de mesas reservadas");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

           
             
            switch (opcion) {
                case 1:
                    getMesasPorEstado(vgEstadoDisponible);
                    break;
                case 2:
                    
                    Cliente vlCliente = new Cliente();
                    vlCliente.setNombre("Luis");
                    vlCliente.setApellido("Hernandez");
                    vlCliente.setIdentificacion("202220222");
                    vlCliente.setTelefono("6027-8904");
                    int vlNumeroMesa = 3;
                    String vlFecha = "17/08/2023";
                    String vlHora = "1:00pm";

                    reservarMesa(vlCliente, vlNumeroMesa, vlFecha, vlHora);
                    
                    break;
                case 3:
                    getMesasPorEstado(vgEstadoReservada);

                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción erronea. vuelva a intentarlo.");
                    break;
            } 

            System.out.println(); 
        } 

       
        while (opcion != 4);

        entrada.close();
    }
    public void Saludar() {
        System.out.print("Hola");
    }

    public void login() {

        
        Scanner entrada = new Scanner(System.in);

       
        String vlUsuario = "";
        String vlClave = "";

        System.out.println("ingrese sus credenciales");
        System.out.println("Ingrese su usuario");
        vlUsuario = entrada.next();
        System.out.println("ingrese su contraseña");
        vlClave = entrada.next();

        Seguridad vlSeguridad = new Seguridad();
        vlSeguridad.registrodeusuarios();
        Boolean vlResultado = vlSeguridad.buscarporusuarioclave(vlUsuario, vlClave);

        if (vlResultado) {
            System.out.println("Bienvenido!");
            MostrarOpciones();
        } else {
            System.out.println("Credenciales incorrectas!");

        }

        entrada.close();

    }

    public void inicializarMesas() {
       
        for (int indice = 0; vgArregloDeMesas.length -1> indice; indice++) {
            vgArregloDeMesas[indice] = new Mesa(indice + 1, 4);
        }

    }

    
    public void getMesasPorEstado(String vpEstado) {
        System.out.println("Lista de mesas : " + vpEstado);

        for (int indice = 0; vgArregloDeMesas.length-1 > indice; indice++) {
            String vlEstado = vgArregloDeMesas[indice].getVgEstado();

            if (vlEstado.equals(vpEstado)) {
                System.out.println("Mesa #" + vgArregloDeMesas[indice].getVgNumeroDeMesa());
            }
        }
    }

    
    public void reservarMesa(Cliente vpCliente, int vpNumeroMesa, String vpFecha, String vpHora) {

       
        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {

           
            
            Mesa vlMesaDelCiclo = vgArregloDeMesas[indice];
           
            String vlEstado = vlMesaDelCiclo.getVgEstado(); 
            int vlNumeroMesa = vlMesaDelCiclo.getVgNumeroDeMesa(); 
            
            
            if (vlNumeroMesa == vpNumeroMesa  && vlEstado.equals(vgEstadoDisponible)) {

                
                System.out.println("La mesa #" + vpNumeroMesa + ", fue reservadaad!");

                
                
                vgArregloDeMesas[indice].setVgEstado(vgEstadoReservada);
                vgArregloDeMesas[indice].setVgCliente(vpCliente);
                vgArregloDeMesas[indice].setFecha(vpFecha);
                vgArregloDeMesas[indice].setHora(vpHora);

                return;
            }
        }

       
        System.out.println("El numero de mesa: " + vpNumeroMesa + " no esta disponible!");
    }

    public void busquedaReservaPorCliente(String vpIdentificacion){

    }

    public void cancelarReservaPorCliente(String vpIdentificacion){
        
    }
}
