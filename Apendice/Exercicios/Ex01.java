package Apendice.Exercicios;

import Apendice.Events_Listeners_Sources.MeuListener;

import javax.swing.*;

public class Ex01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("K19 - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Usuário: ");

        JTextField textField = new JTextField(20);
        JLabel label2 = new JLabel("Senha: ");

        JPasswordField passwordField = new JPasswordField(20);
        JButton button = new JButton("Logar");

        MeuListener listener = new MeuListener();
        button.addActionListener(listener);

        panel.add(label1);
        panel.add(textField);
        panel.add(label2);
        panel.add(passwordField);
        panel.add(button);

        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
