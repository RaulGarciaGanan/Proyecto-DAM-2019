package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CambioJunta {
    private JComboBox cargo;
    private JPanel CambioJunta;
    private JTextField Cod_socio_junta;
    private JButton volverButton;
    private JButton modificarButton;
    private JButton consultarSociosButton;
    public static JPanel cambioJuntasMenu = new CambioJunta().CambioJunta;

    public CambioJunta() {
        volverButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(GestionJuntas.gestionJuntasMenu);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);
        });


        modificarButton.addActionListener(e -> {

        });


        consultarSociosButton.addActionListener(e -> {

        });
    }

    public JComboBox getCargo() {
        return cargo;
    }

    public void setCargo(JComboBox cargo) {
        this.cargo = cargo;
    }

    public JPanel getCambioJunta() {
        return CambioJunta;
    }

    public void setCambioJunta(JPanel cambioJunta) {
        CambioJunta = cambioJunta;
    }

    public JTextField getCod_socio_junta() {
        return Cod_socio_junta;
    }

    public void setCod_socio_junta(JTextField cod_socio_junta) {
        Cod_socio_junta = cod_socio_junta;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(JButton volverButton) {
        this.volverButton = volverButton;
    }

    public JButton getModificarButton() {
        return modificarButton;
    }

    public void setModificarButton(JButton modificarButton) {
        this.modificarButton = modificarButton;
    }

    public JButton getConsultarSociosButton() {
        return consultarSociosButton;
    }

    public void setConsultarSociosButton(JButton consultarSociosButton) {
        this.consultarSociosButton = consultarSociosButton;
    }
}
