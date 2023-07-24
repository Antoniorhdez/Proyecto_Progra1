package UX;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menú Ejemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
        JMenuBar menuBar = new JMenuBar();


        JMenu fileMenu = new JMenu("Archivo");
        JMenu editMenu = new JMenu("Editar");
        JMenu helpMenu = new JMenu("Ayuda");

     
        JMenuItem newItem = new JMenuItem("Nuevo");
    
        JMenuItem openItem = new JMenuItem("Abrir");
        JMenuItem saveItem = new JMenuItem("Guardar");
        JMenuItem exitItem = new JMenuItem("Salir");

        JMenuItem cutItem = new JMenuItem("Cortar");
        JMenuItem copyItem = new JMenuItem("Copiar");
        JMenuItem pasteItem = new JMenuItem("Pegar");

        JMenuItem aboutItem = new JMenuItem("Acerca de");

        
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);

       
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

   
        frame.setJMenuBar(menuBar);

      
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
