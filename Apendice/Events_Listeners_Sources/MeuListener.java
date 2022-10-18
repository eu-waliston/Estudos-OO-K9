package Apendice.Events_Listeners_Sources;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        button.setText("Logado");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("WeSantos DEV");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();

        JLabel rotulo = new JLabel();
        rotulo.setText("Usuario: ");
        jPanel.add(rotulo);

        JTextField textField = new JTextField(40);
        jPanel.add(textField);

        JLabel rotulo2 = new JLabel();
        rotulo2.setText("Senha: ");
        jPanel.add(rotulo2);

        JPasswordField passwordField = new JPasswordField(20);
        jPanel.add(passwordField);

        frame.setContentPane(jPanel);

        frame.pack();
        frame.setVisible(true);

        JButton button1 = new JButton("login");
        MeuListener listener = new MeuListener();
        button1.addActionListener(listener);
        jPanel.add(button1);

        frame.setSize(600, 600);
    }
}


