package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionUsuarios {
    private JButton anadirSociosButton;
    private JPanel GestionUsuario;
    private JButton listadoDeSociosButton;
    private JButton gestionDeLaJuntaButton;
    private JButton volverButton;

    public static JPanel menuGestionUsuarios = new GestionUsuarios().GestionUsuario;

    public GestionUsuarios() {
        anadirSociosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(ValidarUsuario.menuValUsuario);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
        listadoDeSociosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(ListadoSocios.sociosMenu);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });

        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(MenuAdministrador.menuAdmin);
                Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
    }

    public JButton getAnadirSociosButton() {
        return anadirSociosButton;
    }

    public void setAnadirSociosButton(JButton anadirSociosButton) {
        this.anadirSociosButton = anadirSociosButton;
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
