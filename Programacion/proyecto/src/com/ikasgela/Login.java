package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JButton loguearseButton;
    private JButton cancelarButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel panel;


    public Login() {
        cancelarButton.addActionListener(e -> {

            Menu.getFrame().setContentPane(new Menu().getMenu());
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);

        });
    }


    public JButton getLoguearseButton() {
        return loguearseButton;
    }

    public void setLoguearseButton(JButton loguearseButton) {
        this.loguearseButton = loguearseButton;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public void setPasswordField1(JPasswordField passwordField1) {
        this.passwordField1 = passwordField1;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
}
