package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionJuntas {
    private JPanel GestionJuntas;
    private JButton volverButton;
    private JButton juntaActualButton;
    private JButton modificarJuntaButton;


    public static JPanel gestionJuntasMenu = new GestionJuntas().GestionJuntas;

    public GestionJuntas() {


        volverButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(MenuAdministrador.menuAdmin);
            Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);
        });


        modificarJuntaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(CambioJunta.cambioJuntasMenu);
                Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });


        juntaActualButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(JuntaActual.menuJunta);
            Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);
        });
    }




    public JPanel getGestionJuntas() {
        return GestionJuntas;
    }

    public void setGestionJuntas(JPanel gestionJuntas) {
        GestionJuntas = gestionJuntas;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(JButton volverButton) {
        this.volverButton = volverButton;
    }

    public JButton getJuntaActualButton() {
        return juntaActualButton;
    }

    public void setJuntaActualButton(JButton juntaActualButton) {
        this.juntaActualButton = juntaActualButton;
    }

    public JButton getModificarJuntaButton() {
        return modificarJuntaButton;
    }

    public void setModificarJuntaButton(JButton modificarJuntaButton) {
        this.modificarJuntaButton = modificarJuntaButton;
    }
}
