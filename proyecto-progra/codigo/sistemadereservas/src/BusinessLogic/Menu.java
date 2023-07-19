package BusinessLogic;

import java.util.Scanner;
import common;

public class Menu {

    
    public Menu() { 
        MostrarOpciones();
    } 

   
    public void MostrarOpciones() { 

       
        Scanner entrada = new Scanner(System.in);

       
        int opcion = 0;


        do {

            
            System.out.println("=== Menú ===");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

        
            opcion = entrada.nextInt();


            switch (opcion) {
                    Saludar();
                    
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción 2");
                    
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción 3");
                   
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
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

        System.out.println("Por favor ingrese sus credenciales");
        System.out.println("Ingrese su usuario");
        vlUsuario = entrada.next();
        System.out.println("Por favor ingrese su contraseña");
        vlClave = entrada.next();

        Seguridad vlSeguridad = new Seguridad();

        Boolean vlResultado = vlSeguridad.buscarPorUsuarioClave(vlUsuario, vlClave);

        if (vlResultado) {
            System.out.println("Bienvenido!");
            MostrarOpciones();
        } else {
            System.out.println("Credenciales incorrectas!");

        }

        entrada.close();

    }

    public void inicializarMesas() {
       
        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {
            vgArregloDeMesas[indice] = new Mesa(indice + 1, 4);
        }

    }

    
    public void getMesasPorEstado(String vpEstado) {
        System.out.println("Lista de mesas : " + vpEstado);

        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {
            String vlEstado = vgArregloDeMesas[indice].getVgEstado();

            if (vlEstado.equals(vpEstado)) {
                System.out.println("Mesa #" + vgArregloDeMesas[indice].getVgNumeroDeMesa());
            }
        }
    }

    /**
     * 
     * @param vpCliente
     * @param vpNumeroMesa
     * @param vpFecha
     * @param vpHora
     */
    public void reservarMesa(Cliente vpCliente, int vpNumeroMesa, String vpFecha, String vpHora) {

        
        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {

            

            
            Mesa vlMesaDelCiclo = vgArregloDeMesas[indice];
           
            String vlEstado = vlMesaDelCiclo.getVgEstado(); 
            int vlNumeroMesa = vlMesaDelCiclo.getVgNumeroDeMesa(); 
            

            if (vlNumeroMesa == vpNumeroMesa  && vlEstado.equals(vgEstadoDisponible)) {

                
                System.out.println("La mesa #" + vpNumeroMesa + ", fue reservada de forma exitosa!");

                
                vgArregloDeMesas[indice].setVgEstado(vgEstadoReservada);
                vgArregloDeMesas[indice].setVgCliente(vpCliente);
                vgArregloDeMesas[indice].setFecha(vpFecha);
                vgArregloDeMesas[indice].setHora(vpHora);

                return;
            }
        }

        
        System.out.println("El numero de mesa: " + vpNumeroMesa + " no esta disponible!");
    }
    
}