package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAdministrador {
    private JButton gestionDeSociosButton;
    private JPanel MenuAdministrador;
    private JButton gestionDeCuotasButton;
    private JButton salidasButton;
    private JButton datosPersonalesButton;
    private JButton volverButton;

    static JFrame frame = new JFrame();


    public MenuAdministrador() {
        volverButton.addActionListener(e -> {
            frame.setContentPane(new Menu().getMenu());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }

    public JButton getGestionDeSociosButton() {
        return gestionDeSociosButton;
    }

    public void setGestionDeSociosButton(JButton gestionDeSociosButton) {
        this.gestionDeSociosButton = gestionDeSociosButton;
    }

    public JPanel getMenuAdministrador() {
        return MenuAdministrador;
    }

    public void setMenuAdministrador(JPanel menuAdministrador) {
        MenuAdministrador = menuAdministrador;
    }

    public JButton getGestionDeCuotasButton() {
        return gestionDeCuotasButton;
    }

    public void setGestionDeCuotasButton(JButton gestionDeCuotasButton) {
        this.gestionDeCuotasButton = gestionDeCuotasButton;
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
