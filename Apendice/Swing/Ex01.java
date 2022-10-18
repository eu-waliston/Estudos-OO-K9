package Apendice.Swing;

import javax.swing.*;

public class Ex01 {
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


        //JTextArea textArea = new JTextArea(10,20);
        //jPanel.add(textArea);


        JButton button1 = new JButton("Login");
        JButton button2 = new JButton("Recuperar senha");
        JButton button3 = new JButton("Sair");
        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);


        JCheckBox checkBox1 = new JCheckBox("Rafael Cosentino");
        JCheckBox checkBox2 = new JCheckBox("Jonas Hirata");
        JCheckBox checkBox3 = new JCheckBox("Marcelo Martins");
        jPanel.add(checkBox1);
        jPanel.add(checkBox2);
        jPanel.add(checkBox3);


        String[] items = new String[3];
        items[0]= "Rafael Cosentino";
        items[1]= "Jonas Hirata";
        items[2]= "Marcelo Martins";

        JComboBox comboBox = new JComboBox(items);
        jPanel.add(comboBox);


        frame.setSize(800, 800);
    }
}
