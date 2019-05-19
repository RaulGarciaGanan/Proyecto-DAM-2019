package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActividadNueva {
    private JPanel Actividad;
    private JComboBox CBtipoActividad;
    private JComboBox CBDificultad;
    private JTextField TFFecha;
    private JTextField TFDescripcion;
    private JTextField TFPrecio;
    private JButton cancelarButton;
    private JButton guardarButton;

    public static JPanel actividadMenu = new ActividadNueva().Actividad;

    public ActividadNueva() {
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(GestionActividades.actividadesMenu);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getActividad() {
        return Actividad;
    }

    public void setActividad(JPanel actividad) {
        Actividad = actividad;
    }

    public JComboBox getCBtipoActividad() {
        return CBtipoActividad;
    }

    public void setCBtipoActividad(JComboBox CBtipoActividad) {
        this.CBtipoActividad = CBtipoActividad;
    }

    public JComboBox getCBDificultad() {
        return CBDificultad;
    }

    public void setCBDificultad(JComboBox CBDificultad) {
        this.CBDificultad = CBDificultad;
    }

    public JTextField getTFFecha() {
        return TFFecha;
    }

    public void setTFFecha(JTextField TFFecha) {
        this.TFFecha = TFFecha;
    }

    public JTextField getTFDescripcion() {
        return TFDescripcion;
    }

    public void setTFDescripcion(JTextField TFDescripcion) {
        this.TFDescripcion = TFDescripcion;
    }

    public JTextField getTFPrecio() {
        return TFPrecio;
    }

    public void setTFPrecio(JTextField TFPrecio) {
        this.TFPrecio = TFPrecio;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public JButton getGuardarButton() {
        return guardarButton;
    }

    public void setGuardarButton(JButton guardarButton) {
        this.guardarButton = guardarButton;
    }
}
