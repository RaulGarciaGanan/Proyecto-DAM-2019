package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUsuario {
    private JButton consultarSociosButton;
    private JPanel MenuUsuario;
    private JButton salidasButton;
    private JButton datosPersonalesButton;
    private JButton volverButton;

    static JFrame frame = new JFrame();

    public MenuUsuario() {
        volverButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(new Menu().getMenu());
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
        });
    }

    public JButton getConsultarSociosButton() {
        return consultarSociosButton;
    }

    public void setConsultarSociosButton(JButton consultarSociosButton) {
        this.consultarSociosButton = consultarSociosButton;
    }

    public JPanel getMenuUsuario() {
        return MenuUsuario;
    }

    public void setMenuUsuario(JPanel menuUsuario) {
        MenuUsuario = menuUsuario;
    }

    public JButton getSalidasButton() {
        return salidasButton;
    }

    public void setSalidasButton(JButton salidasButton) {
        this.salidasButton = salidasButton;
    }

    public JButton getDatosPersonalesButton() {
        return datosPersonalesButton;
    }

    public void setDatosPersonalesButton(JButton datosPersonalesButton) {
        this.datosPersonalesButton = datosPersonalesButton;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(JButton volverButton) {
        this.volverButton = volverButton;
    }
}
