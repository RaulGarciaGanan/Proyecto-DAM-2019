package com.ikasgela;

import com.ikasgela.Clases.Actividad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionActividades {
    private JPanel Actividades;
    private JButton calendarioDeActividadesButton;
    private JButton generarNuevaActividadButton;
    private JButton volverButton;

    public static JPanel actividadesMenu = new GestionActividades().Actividades;


    public GestionActividades() {
        calendarioDeActividadesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(Calendario.calendarioMenu);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
        generarNuevaActividadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(ActividadMenu.actividadMenu);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
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

    public JPanel getActividades() {
        return Actividades;
    }

    public void setActividades(JPanel actividades) {
        Actividades = actividades;
    }

    public JButton getCalendarioDeActividadesButton() {
        return calendarioDeActividadesButton;
    }

    public void setCalendarioDeActividadesButton(JButton calendarioDeActividadesButton) {
        this.calendarioDeActividadesButton = calendarioDeActividadesButton;
    }

    public JButton getGenerarNuevaActividadButton() {
        return generarNuevaActividadButton;
    }

    public void setGenerarNuevaActividadButton(JButton generarNuevaActividadButton) {
        this.generarNuevaActividadButton = generarNuevaActividadButton;
    }
}
