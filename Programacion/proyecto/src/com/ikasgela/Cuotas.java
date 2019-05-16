package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cuotas {
    private JButton listaDeCuotasButton;
    private JPanel Cuotas;
    private JButton modificarCuotasDeSocioButton;
    private JButton volverButton;

    static JFrame frame = new JFrame();

    public Cuotas() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(new Menu().getMenu());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    public JButton getListaDeCuotasButton() {
        return listaDeCuotasButton;
    }

    public void setListaDeCuotasButton(JButton listaDeCuotasButton) {
        this.listaDeCuotasButton = listaDeCuotasButton;
    }

    public JPanel getCuotas() {
        return Cuotas;
    }

    public void setCuotas(JPanel cuotas) {
        Cuotas = cuotas;
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
