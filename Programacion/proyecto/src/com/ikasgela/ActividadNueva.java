package com.ikasgela;

import com.ikasgela.Clases.Actividad;
import com.ikasgela.ClasesBD.ActividadBD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ActividadNueva {
    private JPanel Actividades;
    private JComboBox CBtipoActividad;
    private JComboBox CBDificultad;
    private JTextField TFFecha_Incio;
    private JTextField TFDescripcion;
    private JTextField TFPrecio;
    private JButton cancelarButton;
    private JButton guardarButton;
    private JTextField TFFecha_Fin;

    public static JPanel actividadMenu = new ActividadNueva().Actividades;

    public ActividadNueva() {
        CBDificultad.addItem("BAJA");
        CBDificultad.addItem("MEDIA");
        CBDificultad.addItem("ALTA");
        CBtipoActividad.addItem("SALIDA AL MONTE");
        CBtipoActividad.addItem("ALBERFGUE FIN DE SEMANA");
        CBtipoActividad.addItem("REUNION");
        CBtipoActividad.addItem("COMIDA");
        CBtipoActividad.addItem("OTROS");
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
                 Actividad actividad = new Actividad();
                 actividad.setDificultad(String.valueOf(CBDificultad.getSelectedItem()));
                 actividad.setTipo(String.valueOf(CBtipoActividad.getSelectedItem()));
                 actividad.setPrecio(Double.parseDouble(TFPrecio.getText()));
                 actividad.setFecha_inicio(LocalDate.parse(TFFecha_Incio.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                 actividad.setFecha_fin(LocalDate.parse(TFFecha_Fin.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                 actividad.setCod_soc(Menu.codigo_socio);
                try {
                    ActividadBD.insertarActividad(actividad);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getActividades() {
        return Actividades;
    }

    public void setActividades(JPanel actividades) {
        Actividades = actividades;
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

    public JTextField getTFFecha_Incio() {
        return TFFecha_Incio;
    }

    public void setTFFecha_Incio(JTextField TFFecha_Incio) {
        this.TFFecha_Incio = TFFecha_Incio;
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
