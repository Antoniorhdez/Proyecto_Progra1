package common.UX;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPNew {
    private JPanel contentPanel;

    public JPNew() {
        contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameTextField = new JTextField(20);
        JButton submitButton = new JButton("Enviar");

        contentPanel.add(nameLabel);
        contentPanel.add(nameTextField);
        contentPanel.add(submitButton);
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }
}

    

