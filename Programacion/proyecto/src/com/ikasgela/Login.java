package com.ikasgela;

import com.ikasgela.Clases.Proyecto;
import com.ikasgela.Clases.Socio;
import com.ikasgela.ClasesBD.SocioBD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JButton loguearseButton;
    private JButton cancelarButton;
    private JTextField Usuario;
    private JPasswordField Password;
    private JPanel panel;

    public static JPanel loginMenu = new Login().panel;

    public Login() {
        cancelarButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(Menu.menuGlobal);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);

        });

        loguearseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contra = new String(Password.getPassword());
                if (Usuario.getText().equals("root")&&contra.equals("root"))
                    Proyecto.inicioRoot();
                else {
                    try {
                        SocioBD.logearSocio();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
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

    public JTextField getUsuario() {
        return Usuario;
    }

    public void setUsuario(JTextField usuario) {
        this.Usuario = usuario;
    }

    public JPasswordField getPassword() {
        return Password;
    }

    public void setPassword(JPasswordField password) {
        this.Password = password;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
}
