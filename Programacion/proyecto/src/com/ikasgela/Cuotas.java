package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cuotas {
    private JPanel Cuotas;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JPasswordField passwordField1;
    private JTextField textField3;
    private JTextField textField4;
    private JButton volverButton;
    private JButton guardarButton;

    public static JPanel cuotasMenu = new Cuotas().Cuotas ;

    public Cuotas() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(GestionCuotas.gestionCuotasCuotasMenu);
                Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getCuotas() {
        return Cuotas;
    }

    public void setCuotas(JPanel cuotas) {
        Cuotas = cuotas;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public void setPasswordField1(JPasswordField passwordField1) {
        this.passwordField1 = passwordField1;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(JButton volverButton) {
        this.volverButton = volverButton;
    }

    public JButton getGuardarButton() {
        return guardarButton;
    }

    public void setGuardarButton(JButton guardarButton) {
        this.guardarButton = guardarButton;
    }
}
