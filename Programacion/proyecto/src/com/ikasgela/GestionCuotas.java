package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionCuotas {
    private JButton listaDeCuotasButton;
    private JPanel GestionCuotas;
    private JButton modificarCuotasDeSocioButton;
    private JButton volverButton;
    private JButton nuevaCuotaButton;

    public static JPanel gestionCuotasCuotasMenu = new GestionCuotas().GestionCuotas;

    public GestionCuotas() {
        volverButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(MenuAdministrador.menuAdmin);
            Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);
        });
        listaDeCuotasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(ListadoCuotas.menuListadoCuotas);
                Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
        nuevaCuotaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(NuevaCuota.nuevaCuotaMenu);
                Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
    }

    public JButton getListaDeCuotasButton() {
        return listaDeCuotasButton;
    }

    public void setListaDeCuotasButton(JButton listaDeCuotasButton) {
        this.listaDeCuotasButton = listaDeCuotasButton;
    }

    public JPanel getGestionCuotas() {
        return GestionCuotas;
    }

    public void setGestionCuotas(JPanel gestionCuotas) {
        GestionCuotas = gestionCuotas;
    }

    public JButton getModificarCuotasDeSocioButton() {
        return modificarCuotasDeSocioButton;
    }

    public void setModificarCuotasDeSocioButton(JButton modificarCuotasDeSocioButton) {
        this.modificarCuotasDeSocioButton = modificarCuotasDeSocioButton;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(JButton volverButton) {
        this.volverButton = volverButton;
    }
}
