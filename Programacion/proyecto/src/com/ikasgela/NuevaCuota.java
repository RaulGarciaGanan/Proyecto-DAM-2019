package com.ikasgela;

import com.ikasgela.Clases.Actividad;
import com.ikasgela.Clases.Cuota;
import com.ikasgela.ClasesBD.ActividadBD;
import com.ikasgela.ClasesBD.CuotaBD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NuevaCuota {
    private JPanel NuevaCuota;
    private JTextField TipoCuota;
    private JTextField Codigo_soc;
    private JTextField AnyoValidez;
    private JButton volverButton;
    private JButton crearButton;
    private JComboBox Tipo_cuota;

    public static JPanel nuevaCuotaMenu = new NuevaCuota().NuevaCuota;

    public NuevaCuota() {
        Tipo_cuota.addItem("Adulto");
        Tipo_cuota.addItem("Menor");
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(GestionCuotas.gestionCuotasCuotasMenu);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cuota cuota = new Cuota();
                cuota.setAnyo_validez(Integer.parseInt(AnyoValidez.getText()));
                cuota.setCod_soc(Integer.parseInt(Codigo_soc.getText()));
                cuota.setTipo_cuota(String.valueOf(Tipo_cuota.getSelectedItem()));
                try {
                    CuotaBD.insertarCuota(cuota);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getNuevaCuota() {
        return NuevaCuota;
    }

    public void setNuevaCuota(JPanel nuevaCuota) {
        this.NuevaCuota = nuevaCuota;
    }

    public JTextField getTipoCuota() {
        return TipoCuota;
    }

    public void setTipoCuota(JTextField tipoCuota) {
        TipoCuota = tipoCuota;
    }

    public JTextField getCodigo_soc() {
        return Codigo_soc;
    }

    public void setCodigo_soc(JTextField codigo_soc) {
        Codigo_soc = codigo_soc;
    }

    public JTextField getAnyoValidez() {
        return AnyoValidez;
    }

    public void setAnyoValidez(JTextField anyoValidez) {
        AnyoValidez = anyoValidez;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(JButton volverButton) {
        this.volverButton = volverButton;
    }

    public JButton getCrearButton() {
        return crearButton;
    }

    public void setCrearButton(JButton crearButton) {
        this.crearButton = crearButton;
    }

    public JComboBox getTipo_cuota() {
        return Tipo_cuota;
    }

    public void setTipo_cuota(JComboBox tipo_cuota) {
        Tipo_cuota = tipo_cuota;
    }
}
