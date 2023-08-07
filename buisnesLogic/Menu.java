package buisnesLogic;

import java.util.Scanner;
import Common.cliente;

public class Menu {

    
    public Menu() { 
        MostrarOpciones();
    } 

   
    public void MostrarOpciones() { // Inicio

       
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

    
}