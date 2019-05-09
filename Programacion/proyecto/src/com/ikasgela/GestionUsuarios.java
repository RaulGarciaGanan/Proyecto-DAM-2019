package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class GestionUsuarios {
    private JButton añadirSociosButton;
    private JPanel GestionUsuario;
    private JButton listadoDeSociosButton;
    private JButton gestionDeLaJuntaButton;
    private JButton volverButton;

    static JFrame frame = new JFrame();

    public GestionUsuarios() {
        añadirSociosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        listadoDeSociosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gestionDeLaJuntaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(new Menu().getMenu());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public JButton getAñadirSociosButton() {
        return añadirSociosButton;
    }

    public void setAñadirSociosButton(JButton añadirSociosButton) {
        this.añadirSociosButton = añadirSociosButton;
    }

    public JPanel getGestionUsuario() {
        return GestionUsuario;
    }

    public void setGestionUsuario(JPanel gestionUsuario) {
        GestionUsuario = gestionUsuario;
    }

    public JButton getListadoDeSociosButton() {
        return listadoDeSociosButton;
    }

    public void setListadoDeSociosButton(JButton listadoDeSociosButton) {
        this.listadoDeSociosButton = listadoDeSociosButton;
    }

    public JButton getGestionDeLaJuntaButton() {
        return gestionDeLaJuntaButton;
    }

    public void setGestionDeLaJuntaButton(JButton gestionDeLaJuntaButton) {
        this.gestionDeLaJuntaButton = gestionDeLaJuntaButton;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(JButton volverButton) {
        this.volverButton = volverButton;
    }
}
