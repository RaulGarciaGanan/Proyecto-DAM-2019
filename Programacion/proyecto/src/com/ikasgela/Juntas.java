package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Juntas {
    private JTextField Fecha_fin;
    private JTextField Presidente;
    private JTextField VidePresi;
    private JTextField Secretario;
    private JTextField Tesoreo;
    private JButton volverButton;
    private JButton guardarButton;
    private JTextField Vocales;
    private JPanel Junta;
    private JTextField Fecha_inicio;


    public static JPanel menuJunta = new Juntas().Junta;

    public Juntas() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(MenuAdministrador.menuAdmin);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
    }

    public JTextField getFecha_inicio() {
        return Fecha_inicio;
    }

    public void setFecha_inicio(JTextField fecha_inicio) {
        Fecha_inicio = fecha_inicio;
    }

    public JTextField getFecha_fin() {
        return Fecha_fin;
    }

    public void setFecha_fin(JTextField fecha_fin) {
        Fecha_fin = fecha_fin;
    }

    public JTextField getPresidente() {
        return Presidente;
    }

    public void setPresidente(JTextField presidente) {
        Presidente = presidente;
    }

    public JTextField getVidePresi() {
        return VidePresi;
    }

    public void setVidePresi(JTextField videPresi) {
        VidePresi = videPresi;
    }

    public JTextField getSecretario() {
        return Secretario;
    }

    public void setSecretario(JTextField secretario) {
        Secretario = secretario;
    }

    public JTextField getTesoreo() {
        return Tesoreo;
    }

    public void setTesoreo(JTextField tesoreo) {
        Tesoreo = tesoreo;
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

    public JTextField getVocales() {
        return Vocales;
    }

    public void setVocales(JTextField vocales) {
        Vocales = vocales;
    }

    public JPanel getJunta() {
        return Junta;
    }

    public void setJunta(JPanel junta) {
        Junta = junta;
    }
}
